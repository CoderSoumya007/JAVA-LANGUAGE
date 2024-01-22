public class ThreadingByRunnableInterface {
    public static void main(String[] args) {
        mythread1 bullet1=new mythread1();  //its like creating a bullet;
    Thread gun1=new Thread(bullet1,"soumya");  //its like creating a gun and loading a bullet into it;
    mythread2 bullet2=new mythread2();
    Thread gun2=new Thread(bullet2,"sameer");
    gun1.start();  //firing gun1 i.e running thread1;
    gun2.start();  //firing gun2 i.e running thread2;

    System.out.println(gun1.getName());
    System.out.println(gun2.getName());
    System.out.println(gun1.threadId());
    System.out.println(gun2.threadId());
    }
}
class mythread1 implements Runnable{
    public void run(){  //overriding run method;
        int i=0;
        while(i<40){   
            System.out.println("i am thread1");
            i++;
        }
    }
   
}
class mythread2 implements Runnable{
    
    public void run(){
        int i=0;
        while(i<40){

            System.out.println("i am thread2");
        i++;
    }
    }
}