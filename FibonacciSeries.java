import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n upto which you want to get the fibonacci series");
        int n=sc.nextInt();
        int a=0,b=1;
        for(int i=0;i<n;i++){
            int sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
    }
}
