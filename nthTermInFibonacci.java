import java.util.Scanner;
public class nthTermInFibonacci {
    static int nthtermfibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return nthtermfibonacci(n-2)+nthtermfibonacci(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
System.out.println("Enter the value of nth term in reference to fibonacci series");
int n=sc.nextInt();
System.out.println("The "+n+"th term in fibonacci series is:"+nthtermfibonacci(n));
    }
}
