public class ThreadConstructor {
    public static void main(String[] args) {
        mythread1 t1=new mythread1("soumya");
        mythread2 t2=new mythread2("sameer");
        t1.start();
        t2.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
      System.out.println(t1.threadId());
      System.out.println(t2.threadId());
    }
}
class mythread1 extends Thread{
    public mythread1(String name){
super(name);  //goes to the thread class;
    }
    public void run(){
        System.out.println("i am thread1");
    }
}
class mythread2 extends Thread{
    public mythread2(String name){
        super(name);
    }
    public void run(){
    System.out.println("i am thread2");
    }
}
