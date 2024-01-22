import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class test62 {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();

        pis.connect(pos);  //to connect the pipeInputStream and the PipeoutputStream together

        producer p=new producer(pos);
        consumer c=new consumer(pis);

        p.start();
        c.start();
    }
}

class producer extends Thread{
    OutputStream os;

    producer(OutputStream os){
        this.os=os;
    }

    public void run(){
        try{

            int count=1;
            while(true){
                os.write(count);

                os.flush();   //to make sure the data is send tho other side;

                System.out.println("producer "+count);
                System.out.flush();  //to push the buffer contents to the other side of the stream(i.e outputStream)
                Thread.sleep(10);
                count++;
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

class consumer extends Thread{
    InputStream is;

    consumer(InputStream is){
        this.is=is;
    }

    public void run(){
        try{

            while(true){
                System.out.println("consumer "+is.read());  //data will be recieved through the pipe(i.e pipedInputStream) from
                                                           //the other end (i.e producer side) and those pipes are connected 
                                                          //in the main method through pipe.connect method;
                System.out.flush();
                Thread.sleep(10);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}