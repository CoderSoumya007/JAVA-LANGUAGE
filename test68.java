import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class test68{
    public static void main(String[] args) throws Exception {
        FileOutputStream fos=new FileOutputStream("c:/Users/soumy/Documents/JAVA LANGUAGE/StudentChallenge.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        float list[]={1.2f,2.43f,2.54f,4.3f,5.3f};

        dos.writeInt(list.length); //As java dont support EndofFile so to know how many data present in the file we have to mention the 
                                //nos of data that we are storing so that while retrieving it will be easy;
        for(float x:list){
            dos.writeFloat(x);
            System.out.println(x);
        }

        dos.close();
        fos.close();
    }
}