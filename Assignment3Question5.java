import java.util.*;
public class Assignment3Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer arr[]=new Integer[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Integer i=sc.nextInt();
        count(arr,i);
    }

    public static <T> void count(T[] array,T item){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i].equals(item)){
                count++;
            }
        }
        System.out.println("Number of times "+item+" present in  the array is "+count);
    }
}
