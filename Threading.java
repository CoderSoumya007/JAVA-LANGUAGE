public class Threading {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        t1.setPriority(3);
        t2.setPriority(10);
        t1.start();  //IMPORTANT:START() METHOD IS CALLED ON THE OBJECT OF THE THREAD CLASS,WHICH INITIATES THE THREADING PROCESS.    
        t2.start();  //IMPORTANT:START() METHOD IS CALLED ON THE OBJECT OF THE THREAD CLASS,WHICH INITIATES THE THREADING PROCESS.  
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}

class thread1 extends Thread{
    public void run(){  //USING RUN() METHOD IS COMPULSORY FOR EXECUTING THE THREADING PROCESS;
        int i=0;
        while(i<40){
            System.out.println("Masturbating...");
            i++;
        }
    }

}
class thread2 extends Thread{
    public void run(){
        int i=0;
        while(i<40){
System.out.println("studing...");
i++;
        }
    }
}