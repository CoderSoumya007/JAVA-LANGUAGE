import java.util.Scanner;
public class factorial {
    public static void main(String[]args){
int n,i,fac=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number whose factorial you want to find out");
n=sc.nextInt();
for(i=n;i>0;i--){
fac=fac*i;
}System.out.printf("The factorial of given number is:%d",fac);
    }
}
