import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class test60 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("c:/Users/soumy/Documents/JAVA LANGUAGE/copiedFile.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);

        int x;
        while((x=bis.read())!=-1){  //through buffered Stream 
            System.out.print((char)x);
        }
        System.out.println();
        System.out.println("file MarkSupported "+fis.markSupported());
        System.out.println("Is Buffer MarkSupported "+bis.markSupported());  //bufferedStreeam is MarkSupported whereas fileInputStream is not MarkSupported;
        fis.close();
        bis.close();
    }
}
