import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class test61 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("c:/Users/soumy/Documents/JAVA LANGUAGE/copiedFile.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);

        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read()); //-v
        bis.mark(10);
        System.out.println((char)bis.read()); //-a
        System.out.println((char)bis.read());  //- 
        System.out.println((char)bis.read());  //-l
        System.out.println((char)bis.read());  //-a
        bis.reset();  //reseted to marked Position
        System.out.println((char)bis.read());  //-a
        System.out.println((char)bis.read());  //- 
        System.out.println((char)bis.read());  //-l
        System.out.println((char)bis.read());  //-a

        String s=new String(bis.readAllBytes());
        System.out.println(s);
        bis.close();
    }
}
