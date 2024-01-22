
import java.util.*;

public class Assignment3Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your lucky number");
        int num=sc.nextInt();
        if(num<0){
            throw new NumberFormatException("Negative number");
        }else{
            System.out.println("Your lucky number is "+num);
        }
    }
}
