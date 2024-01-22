import java.util.Scanner;
public class FactorialusingRecursion {
     int factorial(int n){
        int fac;
        if(n==0){
            return 1;
        }else{
            fac=n*factorial(n-1);
        }return fac;
    }
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
FactorialusingRecursion obj=new FactorialusingRecursion();
System.out.println("Enter a number whose factorial you want to find out using recursion");
int n=sc.nextInt();
int c=obj.factorial(n);  //*****declaring a function using object  */;

System.out.println("The factorial of "+n+" is "+c);
    }
}
