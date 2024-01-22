public class test44 {
    public static void main(String[] args) {
        My m=new My();
        m.setDaemon(true);  //As the thread is set Deamon so main thread will not wait for the thread ;
        m.start();
         
        Thread mainthread =Thread.currentThread();
        
        try {
            mainthread.join(100);
        } catch (InterruptedException e) {
           System.out.println(e);
        }

        int mt=1;
        while(true){
            System.out.println("mainThread"+ mt++);
            Thread.yield();  //lets the other thread utilise more cpu time;
        }
    }
}

class My extends Thread{
    public void run(){

        int count=1;
        while(true){
            System.out.println(count++);
        }



    }
}