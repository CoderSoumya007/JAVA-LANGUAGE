import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class test66 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("c:/Users/soumy/Documents/JAVA LANGUAGE/Serialization1.txt");
        DataOutputStream dos =new DataOutputStream(fos);  

        student s=new student();
        s.name="soumya ranjan panda";
        s.roll=39;
        s.dept="Csit";

        dos.writeUTF(s.name);
        dos.writeInt(s.roll);
        dos.writeUTF(s.dept);

        System.out.println("File is created with given text"); 
                         //*****File created using DataOutputStream is a binary file so we cannot read it***********/
        fos.close();
        dos.close();
        


    }
}

class student {
    String name;
    int roll;
    String dept;
}

