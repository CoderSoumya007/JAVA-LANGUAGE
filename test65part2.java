import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class test65part2 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("c:/Users/soumy/Documents/JAVA LANGUAGE/Serialization.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));  //BufferedReader is Required becoox fileInputStream reads byte
                                     //by byte which cant be stored in any information.As bufferdReader reads in terms of Line using 
                                     //readLine() method so here we are using BufferReader
                                     

        student s=new student();
        s.roll=Integer.parseInt(br.readLine());
        s.name=br.readLine();
        s.dept=br.readLine();
        System.out.println(s.roll);
        System.out.println(s.name);
        System.out.println(s.dept);

        fis.close();
        br.close();
        
    }
}
