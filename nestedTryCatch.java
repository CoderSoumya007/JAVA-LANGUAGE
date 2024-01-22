import java.util.Scanner;
public class nestedTryCatch {
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
    System.out.println("This program is all about the nested try catch block");  //if exception occurs then the catch block gets executed;
                                                                                    //otherwise the try block statement gets executed;
    try{
        System.out.println(array[ind]);
        try{
            System.out.println("The value of "+array[ind] +" divided by "+n+" is "+array[ind]/n);
        }catch(Exception e){
            System.out.println("There's a arithematic exception");
        }
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Out of boundary exception occured");
        System.out.println("exception in level 2");
    }
}catch(Exception e){
    System.out.println("exception in level 1");
}
System.out.println("Thanks for using the program");
    }
}
