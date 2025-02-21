public class Maxsum {
    static int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int maxSum(int[] nums) {
        int[] maxNum = new int[82]; // Array to store max number for each digit sum
        int maxSum = -1;

        for (int num : nums) {
            int sum = digitSum(num);

            if (maxNum[sum] != 0) { // If there's already a number with this digit sum
                maxSum = Math.max(maxSum, num + maxNum[sum]);
            }

            // Store the maximum number for this digit sum
            maxNum[sum] = Math.max(maxNum[sum], num);
        }

        return maxSum;



//        HashMap<Integer, Integer> map = new HashMap<>();
//        int maxSum = -1;
//
//        for (int num : nums) {
//            int sum = digitSum(num);
//
//            if (map.containsKey(sum)) {
//                maxSum = Math.max(maxSum, num + map.get(sum));
//            }
//
//            map.put(sum, Math.max(map.getOrDefault(sum, 0), num));
//        }
//
//        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {51, 17, 71, 42};
        System.out.println(maxSum(arr)); // Output: 93
    }
}
