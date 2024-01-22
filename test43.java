public class test43 {
    public static void main(String[] args) throws Exception {
        myThread t=new myThread("soumya");
         t.start();

        System.out.println(t.getName());
        t.setPriority(4);
        System.out.println(t.getPriority());
        System.out.println(t.getState());  //if Thread started then it returns Running;
        System.out.println(t.getId());
        // *********Enquiry Methods***************
        System.out.println(t.isAlive());
        System.out.println(t.isDaemon());
        t.interrupt();
        System.out.println(t.interrupted());  //should be accessed in a static manner;
        Thread.sleep(100);
    }
}

class myThread extends Thread{

    myThread(String name){  //Constructor to set properties of The Thread;
        super(name);
    }



    public void run(){
        int count =1;
        while(true){
            System.out.println(count++);
            
            try{
            Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}