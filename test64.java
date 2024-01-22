import java.io.File;
import java.io.FileOutputStream;

public class test64 {
    public static void main(String[] args) throws Exception{
        File f=new File("c:/Users/soumy/Documents/JAVA LANGUAGE/fileHandling.txt");
       System.out.println( f.exists());

       System.out.println(f.getAbsolutePath());
    f.setWritable(false);
    FileOutputStream fos=new FileOutputStream(f);  //As file is set to read only mode so we cannot write anything on the file;
    fos.write('b');;
    }
}
