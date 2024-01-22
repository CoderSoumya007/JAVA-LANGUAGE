package sumation;
import java.util.Scanner;
public class sum1d {
    public static void main(String[] args) {
        int n;
        int []array=new int[4];  //VERY IMPORTANT STEP FOR INITIALISING AN ARRAY;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        array1 obj=new array1();
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        // for(int a:array){
        //     System.out.println(a);
        // }
        System.out.println(obj.add1dArray(array));
    }
}
class array1{
    
    public int[] add1dArray(int[]array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
            array[i]=sum;
           
        }
        return array;
    }
    }