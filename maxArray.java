public class maxArray {
    public static void main(String[]args){
        int[] marks={3554,453,34,423,35352,3434,53,4,1,4334};
        int max=Integer.MIN_VALUE;  //will store the minimum value;
        int min=Integer.MAX_VALUE;  //will store the maximum value possible in int;
        for(int element:marks){
            if(element>max){
                max=element;
            }
        }System.out.printf("The max element in the array is:%d\n",max);
        for(int element:marks){
            if(element<min){
                min=element;
            }
        }System.out.printf("The min element int the array is:%d",min);
    }
}
