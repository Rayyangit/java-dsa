import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayIncreasingDecreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = rearrangeArray(arr);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> rearrangeArray(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr); // Sort the entire array

        ArrayList<Integer> result = new ArrayList<>();

        // Add first half in increasing order
        for (int i = 0; i < n / 2; i++) {
            result.add(arr[i]);
        }

        // Add second half in decreasing order
        for (int i = n - 1; i >= n / 2; i--) {
            result.add(arr[i]);
        }

        return result;
    }
}
