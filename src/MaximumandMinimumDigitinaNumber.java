import java.util.Scanner;

public class MaximumandMinimumDigitinaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = findMinMaxDigits(n);
        System.out.println("Minimum Digit: " + result[0]);
        System.out.println("Maximum Digit: " + result[1]);
    }

    public static int[] findMinMaxDigits(int n) {
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        while (n > 0) {
            int d = n % 10;
            large = Math.max(d, large);
            small = Math.min(d, small);
            n /= 10;
        }
        return new int[]{small, large};
    }
}
