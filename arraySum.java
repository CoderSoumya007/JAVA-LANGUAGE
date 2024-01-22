public class arraySum {
    public static void main(String[]args){
        float []marks={87.43f,89.54f,92f,93.45f,95.5f};
        float sum=0;
        for(int i=0;i<marks.length;i++){
            sum=sum+marks[i];
        }System.out.printf("The sum of your marks is %.2f",sum);
    }
}
