public class threadInterruptMethod{
   public static void main(String[] args) {
    interruptedThread c=new interruptedThread();
    
    c.start();
    c.interrupt();
   
    System.out.println("main method");
   } 
}


class interruptedThread extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("child thread");  //child thread interrupted and interrupted exception is generated; 
                
                Thread.sleep(4000); //<--- THIS IS THE SYNTAX OF SLEEP METHOD;
            }
        }
            catch(InterruptedException e){
                System.out.println("child thread interrrupted");
            } System.out.println("thread is running");
    }
}
