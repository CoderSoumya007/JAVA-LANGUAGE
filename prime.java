import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j=0;
        System.out.println("Enter the number to check whether prime or not");
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Its a not a prime number");
                j=0;
                break;
            } else {
                j=1;
            }
        }
        if (j == 1) {
            System.out.println("Its a prime number");
        }

    }
}
