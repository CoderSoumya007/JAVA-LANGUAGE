public class binarysearch {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 10, 45, 80 };
        int x = 80;
        int n = arr.length - 1;
        int result = search(arr, x, 0, n);
        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }

    }

    public static int search(int arr[], int x, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (high + low / 2);
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] < x) {
            return search(arr, x, mid + 1, high);
        } else {
            return search(arr, x, low, mid - 1);
        }

    }
}
