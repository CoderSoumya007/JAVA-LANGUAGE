public class test49 {
    public static void main(String[] args) {
       String s=new String("soumya");
       StringBuffer sb=new StringBuffer(s); //Thsi is Thread safe;
       thread1 t=new thread1(sb);
       thread2 t2=new thread2(sb);
       t.start();
       t2.start();
    //    StringBuilder sv=new StringBuilder(s);
    //    s.concat(" world");
    //    System.out.println(s);
    //    System.out.println(sb.append(" ranjan panda"));
    //    System.out.println(sb);
    }
}
class print{
    synchronized static void display(StringBuffer s,int x){
        int i=0;
        while(i<x){
    System.out.print(s);
    i++;
        }
        System.out.println();
    }
}

class thread1 extends Thread{
    StringBuffer t;
    thread1(StringBuffer sb){
        t=sb;
    }
    int i=1;
    public void run(){
    print.display(t.append(i),5);
    
        }
    }

class thread2 extends Thread{
    StringBuffer t;
    thread2(StringBuffer sb){
        t=sb;
    }
    int i=1;
    public void run(){
        while(i<5){
    print.display(t.append('A'),5);
    i++;
        }
    }
}