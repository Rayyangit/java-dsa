import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        sc.close();

        System.out.print("Fibonacci Series: ");
        fibo(n);
    }

    public static void fibo(int n) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " "); // Print first two terms

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " "); // Print the next term
            a = b;
            b = c;
        }
    }
}
