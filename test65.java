import java.io.FileOutputStream;
import java.io.PrintStream;

public class test65 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("c:/Users/soumy/Documents/JAVA LANGUAGE/Serialization.txt");
        PrintStream ps=new PrintStream(fos);  //to print string wise rather byte wise;

        student s=new student();
        s.name="soumya ranjan panda";
        s.roll=39;
        s.dept="Csit";

        ps.println(s.roll);
        ps.println(s.name);
        ps.println(s.dept);

        System.out.println("File is created with given text");
        ps.close();
        fos.close();
        


    }
}

class student {
    String name;
    int roll;
    String dept;
}