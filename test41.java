public class test41 extends Thread{

    public void run(){
            int i=1;
            while(true){
                System.out.println(i+" hello");
                i++;
            }
        }

    public static void main(String[] args) {

        test41 t=new test41();  
        
        
            t.start();            //**********IMPORTant for running the Thread;****** */
    
        int i=1;
        while(true){
            System.out.println(i+" world");
            i++;
        }
    }
}
