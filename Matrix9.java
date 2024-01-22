public class Matrix9 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,2},
                     {5,6,7,8,5},
                     {9,10,11,12,6}};

SpiralMatrix(arr);
    }
    public static void SpiralMatrix(int arr[][]){
        int R=arr.length;
        int C=arr[0].length;
        int index=0;
        if(R==1){
                for(int j=0;j<C;j++){
                    System.out.print(arr[0][j]+" ");
                }
        }
        else  if(C==1){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][0]+" ");
            }
        }
        else{
            for(int j=0;j<R/2;j++)
            {
            for(int i=j;i<C-j;i++){
                System.out.print(arr[j][i]);
            }
            for(int i=j+1;i<R-j;i++){
                System.out.print(arr[i][C-1-j]);
            }
            for(int i=C-2-j;i>=j;i--){
                System.out.print(arr[R-1-j][i]);
            }
            for(int i=R-2-j;i>j;i--){
                System.out.print(arr[i][j]);
            }
            index++;
        }
        }
        System.out.println("index"+index);
        if(R%2!=0){
            for(int i=index;i<C-index;i++){
            System.out.println(arr[index][i]);
            }
        }
    }
}
