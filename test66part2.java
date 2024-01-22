import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class test66part2 {
      public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("c:/Users/soumy/Documents/JAVA LANGUAGE/Serialization1.txt");
        DataInputStream dis=new DataInputStream(fis);  //DataInputStream contents can only be readed by DataOutputStream;
                                     

        student s=new student();
       
        s.name=dis.readUTF();  //***Data sequence should be same as given in the file******/
        s.roll=dis.readInt();
        s.dept=dis.readUTF();

        System.out.println(s.roll);
        System.out.println(s.name);
        System.out.println(s.dept);

        fis.close();
        dis.close();
        
    }
}

