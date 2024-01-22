public class secondMax {

    public static void rotateArray(int[] arr){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }arr[arr.length-1]=temp;
        System.out.print("new rotated array->");
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();
        return ;
    }

    public static void insertelement(int[]arr,int elem,int location){
        int[] newarr=new int[arr.length+1];
int j=0;
     for(int i=0;i<newarr.length;i++){ 
        if(i==location){
      newarr[i]=elem;
      continue;
      }
      newarr[i]=arr[j];
      j++;
     
     }
     System.out.print("newarray->");
     for(int e:newarr){
        System.out.print(e+" ");
    }System.out.println();
    }
    public static void main(String[] args) {
        int []arr={5,9,6,10,12,7,3,5,4,2};
        int element=343;
        int location=5;
        insertelement(arr,element,location);
        rotateArray(arr);
        int max1=arr[0],max2=arr[0];
       for(int i=0;i<arr.length;i++){
        if(arr[i]>max1){
            int temp=max1;
            max1=arr[i];
            max2=temp;
        }else if(arr[i]>max2){
            max2=arr[i];
        }else{}
       } 
       System.out.println(max1+" "+max2);
    }
}
