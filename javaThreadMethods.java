public class javaThreadMethods {
    public static void main(String[] args) {
       mythread1 tr1=new mythread1();
        mythread2 tr2=new mythread2();
        tr1.start();
        try{
        tr1.join();  //JOIN METHOD PUTS THE NEXT THREAD ON WAIT UNTILL THE THREAD ON WHICH IT IS CALLED IS DEAD;
        }catch(InterruptedException e){
            System.out.println(e);
        }
        tr2.start();

        
    }
}
class mythread1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println("i am thread1");
        }
    }
}
class mythread2 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("i am thread2");
        }
    }
}
