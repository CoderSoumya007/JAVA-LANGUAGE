public class test46 {
    public static void main(String[] args) {
        mydata d=new mydata();
        producer p = new producer(d);
        consumer c = new consumer(d);
        p.start();
        c.start();

    }
}
    class mydata{
        int value=0;
        boolean flag=true;
        synchronized public void setData(int v){
            while(flag!=true){
               try{

                    wait();
                }catch(Exception e){
                    System.out.println(e);
                }
            }
            value=v;
            flag=false;
            notify();
            return;
        }
        synchronized public int getData(){
            while(flag!=false){
                try{

                    wait();
                }catch(Exception e){
                    System.out.println(e);
                }
            }
            int x=0;
            x=value;
            flag=true;
            notify();
            return  x;

        }
    }

    class producer extends Thread{
        mydata d;
        producer(mydata data){
        d=data;
        }

        public void run(){
            int i=1;
            while(true){
                d.setData(i);
                System.out.println("producer produces "+i);
                i++;
                try{

                    Thread.sleep(1000);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }

    class consumer extends Thread{
        mydata d;
         consumer(mydata data){
        d=data;
        }

        public void run(){
            while(true){
                System.out.println("consumer consumes "+d.getData());
                try{

                    Thread.sleep(1000);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }

    }



