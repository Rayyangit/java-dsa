//import java.util.Scanner; // Optional import for user input (if needed)
//
//public class sumofntermsoffibonacci {
//
//    public static void main(String[] args) {
//        int n = 5;  // Number of terms to sum in the Fibonacci series
//        int ans = sumOfNTermsOfFibonacci(n);  // Call the method to calculate the sum
//        System.out.println("Sum of first " + n + " terms of Fibonacci series: " + ans);
//    }
//
//    // Method to calculate the sum of the first 'n' terms of the Fibonacci series
//    public static int sumOfNTermsOfFibonacci(int n) {
//        int a = 0;  // First term of Fibonacci series
//        int b = 1;  // Second term of Fibonacci series
//        int sum = a;  // Initialize sum with the first term (0)
//
//        // Iterate from 1 to n-1 since the first term (a) is already counted
//        for (int i = 1; i < n; i++) {
//            sum += b;  // Add the current Fibonacci number to the sum
//            int next = a + b;  // Calculate the next Fibonacci number
//            a = b;  // Move to the next term in the sequence
//            b = next;  // Update b to the next term
//        }
//
//        return sum;  // Return the calculated sum
//    }
//}
