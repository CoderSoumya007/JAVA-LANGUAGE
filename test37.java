import java.io.FileReader;
import java.util.Scanner;


public class test37 {
    static Scanner sc;
    static void meth1() throws Exception{
        try(FileReader f=new FileReader("my.txt"); Scanner sc=new Scanner(f);)  //try with resourses will close the file after using it;
        {                         //Objects created with the "try with resourses" block will automatically get closed after using the file;
           
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(a/c);
        }
    }
    public static void main(String[] args) {
        // try{
        meth1();
        // }catch(Exception e){
// System.out.println(e);
        // }
        System.out.println(sc.nextInt());  //As the Scnaner class is automatically closed by try with resourses block so
                                           //now we cannot access the file;hence a error will appear here;
    }
    
}
