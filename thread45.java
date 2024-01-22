public class thread45 {
    public static void main(String[] args) {
        mydata d=new mydata();
        Thread1 t=new Thread1(d);
        Thread2 t2=new Thread2(d);
        t.start();
        t2.start();
    }
}

class mydata{
    public void display(String s){

        synchronized(this){      //************This keyword or Synchronised block makes the shared object used by one 
                                  //  thread at a time */


     for(int i=0;i<s.length();i++){
        System.out.print(s.charAt(i));
     }
    }
    }
}

class Thread1 extends Thread{
    mydata dat;
    Thread1(mydata data){
        dat=data;
    }

    public void run(){
        dat.display("Soumya Ranjan Panda");
    }
}

class Thread2 extends Thread{
    mydata dat;
    Thread2(mydata data){
        dat=data;
    }

    public void run(){
        dat.display("Shaswat kumar mishre");
    }
}