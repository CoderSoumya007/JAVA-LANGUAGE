import java.util.Scanner;
public class fibonacciUsingRecursion {
    static void fibonacci(int a,int b,int n){
        int sum=0; 
        if(n==0){  //****return is necessary to prevent/break infinite number of method calls */
            return;
        }       
        sum=a+b;
        System.out.print(sum+" ");
        a=b;
        b=sum;
        n--;
        fibonacci(a,b,n);
    }
    
    public static void main(String[]args){
        System.out.print("Enter the value of n upto which you want to get the fibonacci series :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.println("The fibonacci series upto n is:");
        fibonacci(a,b,n);
        
    }
}
