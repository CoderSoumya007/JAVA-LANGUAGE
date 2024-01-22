public class normalThreadInterrupting {
    public static void main(String[] args) {
        interruptnormalThread ic=new interruptnormalThread();
        ic.start();  //here the thread works normally because no exception occured during hte thread's execution;
        //hence the interrupt( only sets the vlaue of the thread flag to true;
        ic.interrupt();
        System.out.println("main method");
        System.out.println(ic.getState());  //RETURNS RUNNABLE AS THE START METHOD IS IMPLEMENTED;
        // System.out.println(Thread.currentThread().getState());
    }
}
class interruptnormalThread extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("i am normal working thread which is not put to sleep");
        }
    }
}