import java.io.FileInputStream;

public class test56 {
    public static void main(String[] args) {
        try(FileInputStream fis=new FileInputStream("C:/Users/soumy/Documents/JAVA LANGUAGE/test.txt")){  //******This is called 
                                //Try with Resources and here we dont need to close the file it will automaticlaly close it */
            
                    byte b[]=new byte[fis.available()];
                    fis.read(b);
                    String s=new String(b);  //convert the bytes array to string;
                    System.out.println(s);

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
