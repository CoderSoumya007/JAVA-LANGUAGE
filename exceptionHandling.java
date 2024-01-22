import java.util.Scanner;
public class exceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array=new int[3];
System.out.println("Enter the array index");
int ind =sc.nextInt();
int n=sc.nextInt();
array[0]=43;
array[1]=43;
array[2]=43;
try{
    System.out.println("The value of "+array[ind] +"divided by "+n+" is"+array[ind]/n);
}catch(ArithmeticException e){  //handles all exception of type arithematic exceptions;
    System.out.println("arithematic exception occured");
}
catch(ArrayIndexOutOfBoundsException e){  //handles all exception of length of array;
    System.out.println(e);
}
catch(Exception e){  //handles all other exceptions;
    System.out.println(e);
}
}
}
