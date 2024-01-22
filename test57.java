import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test57 {
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("C:/Users/soumy/Documents/JAVA LANGUAGE/test.txt");
            FileOutputStream fos=new FileOutputStream("C:/Users/soumy/Documents/JAVA LANGUAGE/copiedFile.txt");
    
           int b;
           while((b=fis.read())!=-1){
            if(b>=65 && b<=120){
                fos.write(b+32);
            }else{
                fos.write(b);
            }
           }
    
            fis.close();
            fos.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
