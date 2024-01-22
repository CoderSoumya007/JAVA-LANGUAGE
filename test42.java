public class test42 {
    public static void main(String[] args) {


        Runnable r=new RunnableInterface();
        Thread t=new Thread(r);
        t.setDaemon(true); //as main thread finishes deamon thread also gets killed;
        t.start();
        // try{

        //     Thread.sleep(1000);  //will sleep for 1000ms and till that only damon thread will work
        // }catch(Exception e){
        //     System.out.println(e);
        // }

        //OR

        Main
        // int i=2;
        // while(true){
        //     System.out.println(i+" world");
        //     i++;
        // }


    }
}
 
class RunnableInterface implements Runnable{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" hello");
            i++;
        }
    }
}
