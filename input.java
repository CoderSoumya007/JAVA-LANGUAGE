import java.util.*;
public class input {
    public static void main(String[] args){
        int a,b,sum;
        Scanner s = new Scanner(System.in);
        System.out.print("Input the value of a:");
        a=s.nextInt();
        System.out.print("Input the value of b:");
        b=s.nextInt();
        sum=a+b;
        System.out.print("The sum of a and b is:");
        System.out.println(sum);

        System.out.println("What is your name?");
        
        String str=s.next();
        System.out.println("Hello "+str+",The sum of a and b is "+sum+".Have a great day!!");
}
}
