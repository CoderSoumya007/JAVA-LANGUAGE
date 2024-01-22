import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class test68part2 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("c:/Users/soumy/Documents/JAVA LANGUAGE/StudentChallenge.txt");
        DataInputStream dis=new DataInputStream(fis);
        
        int i=0;
        int length=dis.readInt();
        while(i<length){
        System.out.println(dis.readFloat());
        i++;
        }

        dis.close();
        fis.close();
    }
}
