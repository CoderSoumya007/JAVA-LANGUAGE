public class Matrix8 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}};

    rotateMatrix(arr);
    }
    public static void rotateMatrix(int arr[][]){
        for(int i=0;i<=arr.length/2;i++){
            for(int j=arr[i].length-1;j>=i;j--){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        int length=arr.length-1;
        for(int i=0;i<=arr.length/2;i++){
            for(int j=0;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[length][j];
                arr[length][j]=temp;
            }
            length--;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
