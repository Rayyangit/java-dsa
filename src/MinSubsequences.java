import java.util.*;

public class MinSubsequences {
    public static int minSubsequences(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0, i = 0, n = nums.length;

        for (int j = 0; j < n; j++) {
            if (j == i || nums[j] - nums[i] > k) {
                count++;
                i = j;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 2, 5};
        int k = 2;
        System.out.println(minSubsequences(nums, k)); // Output: 2
    }
}
//{1,2,3,5,6}