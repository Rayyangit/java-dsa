import java.util.Scanner;

public class pastriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int val = 1; // First value is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " "); // Print current value
                val = val * (i - j) / (j + 1); // Compute next binomial coefficient
            }
            System.out.println();
        }
    }
}
