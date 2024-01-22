import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class test67part2 {
     public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("c:/Users/soumy/Documents/JAVA LANGUAGE/Serialization2.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        student s;
        s=(student)ois.readObject();

        System.out.println(s.name+"\n"+s.roll+"\n"+s.dept+"\n"+s.cgpa+"\n"+s.sec+"\n"+s.group);

        fis.close();
        ois.close();
    }
}
