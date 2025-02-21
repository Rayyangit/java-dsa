import java.util.Collections;
import java.util.PriorityQueue;

public class largestinsubarray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 1, 6, 3};
        int k = 3;
        System.out.println("Maximum elements in each subarray of size " + k + ":");
        largestInSubarray(arr, k);
    }

    public static void largestInSubarray(int[] arr, int k) {
        if (arr.length < k) {
            System.out.println("Invalid input. Array size is less than the window size.");
            return;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);  // Add current element to the max heap

            // Print the maximum for the current window
            if (i >= k - 1) {
                System.out.print(pq.peek() + " ");  // Print the largest element
                pq.remove(arr[i - k + 1]);  // Remove the element sliding out of the window
            }
        }
    }
}
