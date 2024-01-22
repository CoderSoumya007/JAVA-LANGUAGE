import java.util.Scanner;
public class qustion1 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
try{
    System.out.println(a/b);
}catch(ArithmeticException e){
    System.out.println("haha");
}catch(IllegalArgumentException e){
    System.out.println("hehe");
}
    }
}
