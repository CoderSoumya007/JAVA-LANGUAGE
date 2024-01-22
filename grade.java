public class grade {
    int[] reverse(int[] arr){
     int left=0,right=arr.length-1;
      int temp=0;
     while(left<right){
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        ++left;
        --right;  
      }return arr;  
    }
    public static void main(String[] args) {
    int []arr={34,54,6,56,7,68,4,73,7,45,72,45};
    grade gr=new grade();
   System.out.println(gr.reverse(arr));
   for(int element:arr){
    System.out.print(element+" ");
   }
    }
}
