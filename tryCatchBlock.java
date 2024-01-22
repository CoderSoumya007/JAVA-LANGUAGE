import java.util.Scanner;
public class tryCatchBlock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();

// System.out.println(a/b); //without try catch;

try{    //with try and catch block;
   int c=a/b;
   System.out.println(c);
    }catch(Exception e){
        System.out.println("failed to divide by 0");
    }
    }
}
