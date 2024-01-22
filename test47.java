public class test47 {
    public static void main(String[] args) {
        whiteboard w=new whiteboard();
        Teacher t=new Teacher(w);
        t.start();
        student s=new student(w,"soumya");
        student s1=new student(w,"shaswat");
        student s2=new student(w,"laoude");
        s.start();
        s1.start();
        s2.start();

    }
}


class whiteboard{
    String s;
    int NoofStudents=0;
    int count=0;
 
    public void attendence(){
        NoofStudents++;
    }
   synchronized public void write(String t){
    System.out.println("Teacher is writing "+t);
    while(count!=0){
        try {
            wait();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    s=t;
    count=NoofStudents;
    notifyAll();
    }

   synchronized public String read(){
    while(count==0){
        try {
            wait();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
count--;
String text=s;
if(count==0)
notify();
return text;
    }
}
class Teacher extends Thread{
    whiteboard wb;
    Teacher(whiteboard w){
        wb=w;
    }
    String []notes={"i am soumya","i am student at iter","i am a non sense guy","i have dumbest friends","end"};
    public void run(){
        for(int i=0;i<notes.length;i++){
            wb.write(notes[i]);
        }
    }
}

class student extends Thread{
    String name;
    whiteboard wb;
    student(whiteboard w,String name){
        this.name=name;
    wb=w;
    }
    public void run(){
        String text;
        wb.attendence();
        do{
         text=wb.read();
         System.out.println(name+" i am writing "+text );
         System.out.flush();
        }while(!text.equals("end"));
     }
    }
