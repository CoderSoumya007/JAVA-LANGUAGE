public class sort{
    public static void main(String[] args) {
        int arr[] = {300, 78, 219, 94};

        // bubblesort(arr);
        insertionsort(arr);
        System.out.println("Sorted array using Bubble Sort: ");
        printArray(arr);
    }
    public static void bubblesort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++){
                if (arr[j] > arr[j+1]){
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void insertionsort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i){
            int key = arr[i];
            int j=i;
            while(j>0 && key<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=key;
        }
    }
    public static void printArray(int arr[])
{
    for (int value : arr)
        System.out.print(value + " ");
    System.out.println();
}
}