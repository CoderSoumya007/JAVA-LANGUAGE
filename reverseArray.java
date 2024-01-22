public class reverseArray {
    public static void main(String[] args) {
        int[] array = { 345, 454, 34, 534, 465, 686, 34, 56568, 1111 };
        int mid_element;
        if (array.length % 2 == 0) {
            mid_element = array.length / 2;
        } else {
            mid_element = (array.length / 2) + 1;
        }

        for (int i = 0; i < mid_element; i++) {
            int temp = 0;
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;

        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }
}
