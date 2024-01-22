import java.util.*;
;public class Assignment3Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer intarr[]=new Integer[5];
        System.out.println("Enter array elements");
        for(int i=0;i<intarr.length;i++){
            intarr[i]=sc.nextInt();
        }
        print(intarr);
        Double intarr2[]=new Double[5];
        for(int i=0;i<intarr2.length;i++){
            intarr2[i]=sc.nextDouble();
        }
        print(intarr2);
    }
    public static <T> void print(T[] list){
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }
}
