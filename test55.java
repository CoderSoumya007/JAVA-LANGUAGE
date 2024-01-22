import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class test55 {
    public static void main(String[] args) {
        try{
            FileOutputStream fr=new FileOutputStream("C:/Users/soumy/Documents/JAVA LANGUAGE/test.txt");

            String s="JAVA LANGUAGE AND HE ALSO KNOWS DATA STRUCTURES AND ALGORITHMS.\nCURRENTLY HE IS STUDYING GUI AND PARALLELLY HE IS ALSO STUDYING WEB DEVELOPMENT WHICH HE HAS BOUGHT FROM UDEMY";


            // fr.write(s.getBytes());  //directly input the whole string array in form of bytes.

            //OR  input bytes by bytes

            byte[] b=s.getBytes();
            for(byte x:b){
                fr.write(x);
            }
            fr.write('1');



        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
