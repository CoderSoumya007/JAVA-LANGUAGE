import java.util.Arrays;

//Array sorting using bubble sort technique......

public class sortArray {
    public int[] sort(int[] array) {
        int n=array.length/2;
        for (int i = 0; i < n/2; i++) {
        // for (int j = i+1; j < array.length; j++) {
            // if (array[i] > array[j]) {
                int temp = array[i];
                array[i] = array[n-i-1];
                array[n-i-1] = temp;
            }
    // }
        return array;
    }

    public static void main(String[] args) {
        int[] array = { 4, 5, 6, 2, 3, 7, 9, 0 };
        sortArray sa = new sortArray();
        int[] newArray = sa.sort(array);
        System.out.println(Arrays.toString(newArray));
    }
}
