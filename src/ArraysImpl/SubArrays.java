package ArraysImpl;

import java.util.ArrayList;
import java.util.List;

public class SubArrays {

    public static int subArray(int[]arr){
//
//        int oddCount = 0, evenCount = 1;
        final int MOD = 1_000_000_007;
//        int currSum = 0, result = 0;

        // Step 2: Iterate over the array
//        for (int num : arr)
//        {
//            currSum += num;
//
//            // Step 3: If prefix sum is even
//            if (currSum % 2 == 0)
//            {
//                result = (result + oddCount) % MOD;
//                evenCount++;
//            }
//
//            // Step 4: If prefix sum is odd
//            else
//            {
//                result = (result + evenCount) % MOD;
//                oddCount++;
//            }
//        }

        // Step 5: Return the count of subarrays with odd sum
//        return result;

        int result = 0, sum = 0;
        int[] freq = new int[2];
        freq[0]++; // Initialize for empty prefix sum

        for (int num : arr) {
            sum += num;
            result += freq[1 - (sum % 2)]; // Use frequency of the opposite parity
            freq[sum % 2]++; // Update current sum parity count
            result %= MOD;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println( subArray(arr));
    }
}
