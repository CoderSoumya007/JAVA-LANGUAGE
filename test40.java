public class test40 {
    public static void main(String[] args) {

        display t=new display();  
        t.start();            //**********IMPORTant for running the Thread;****** */
                              //we have run the method of Thread class.As this class is inheriting Thread class so we can 
                            //call the run method(thread's method) using display class object ;


        int i=1;
        while(true){
            System.out.println(i+" world");
            i++;
        }
    }
}

class display extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" hello");
            i++;
        }
    }
}