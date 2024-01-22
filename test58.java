import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
public class test58 {
    public static void main(String[] args) {
        try{
            FileInputStream fis1 = new FileInputStream("C:/Users/soumy/Documents/JAVA LANGUAGE/test.txt");
            FileInputStream fis2 = new FileInputStream("C:/Users/soumy/Documents/JAVA LANGUAGE/copiedFile.txt");

            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
            FileOutputStream fos = new FileOutputStream("C:/Users/soumy/Documents/JAVA LANGUAGE/Destination.txt");
            int b;
            while ((b = sis.read()) != -1) {
                fos.write(b);
            }
            sis.close();
            fis1.close();
            fis2.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
} 