public class sortedOrNot {
    public static int sort(int[] marks) {
        int min = Integer.MAX_VALUE;
        for (int element : marks) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] marks = { 5, 7, 8, 9, 45, 56, 78, 89, 3 };
        boolean isSorted = true;
        for (int k = 0; k < marks.length - 1; k++) {
            if (marks[k] > marks[k + 1]) {
                isSorted = false;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
        if (!isSorted) {
            // System.out.println(sort(marks));
            for (int i = 0; i < marks.length; i++) {
                marks[i] = sort(marks);
                System.out.print(marks[i]);
            }
        }
    }
}
