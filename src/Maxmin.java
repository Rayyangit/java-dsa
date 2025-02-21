public class Maxmin {


    public static int lastRemainingNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int n = nums.length / 2;
        int[] newNums = new int[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
            } else {
                newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
            }
        }
        return lastRemainingNumber(newNums);
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 4, 8, 2, 2};
        System.out.println(lastRemainingNumber(nums)); // Output: 1
    }
}
