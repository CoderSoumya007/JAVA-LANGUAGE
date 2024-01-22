import java.util.Scanner;
public class recursiveSUM {
    static int sum(int n){
int sum=0;
if(n==0){    //****this is called as "base condition" */;
    return 0;
}
sum+=n+sum(n-1);
return sum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n upto which you want to find the sum");
        int n=sc.nextInt();
        System.out.println("The sum of first "+n+"natural numbers is "+sum(n));

    }
}
