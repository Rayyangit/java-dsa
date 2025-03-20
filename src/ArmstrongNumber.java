import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close(); // Closing scanner to prevent memory leaks

        boolean ans = isArm(n);
        System.out.println(ans ? "YES" : "NO"); // Printing "YES" or "NO"
    }

    public static boolean isArm(int n) {
        int original = n;
        int arm = 0;
        int digits = String.valueOf(n).length(); // Correctly getting number of digits

        while (original != 0) {
            int digit = original % 10;
            arm += Math.pow(digit, digits);
            original /= 10;
        }

        return n == arm;
    }
}
