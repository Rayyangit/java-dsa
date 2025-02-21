
import java.util.*;
public class MaxContagious {

    public static int maxZeroorone(int nums[]){

        Map<Integer, Integer> sumToIndexMap = new HashMap<>();

        // Initialize the sum of elements to 0 and the answer to the max length to 0.
        sumToIndexMap.put(0, -1); // Sum of 0 is considered to appear before the array starts.
        int sum = 0, maxLength = 0;

        // Iterate through the array.
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i] == 1 ? 1 : -1;


            if (sumToIndexMap.containsKey(sum)) {

                maxLength = Math.max(maxLength, i - sumToIndexMap.get(sum));
            } else {

                sumToIndexMap.put(sum, i);
            }
        }

        // Return the found maximum length.
        return maxLength;
    }

    public static void main(String[] args) {
        int nums[]={0,1,0};
        System.out.println(maxZeroorone(nums));
    }
}
