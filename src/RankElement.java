import java.util.Arrays;
import java.util.TreeMap;

public class RankElement {
    public static void main(String[] args) {
        int[] arr={20, 15, 26, 2, 98, 6};
        int[] res=isRank(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] isRank(int[] arr){
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int[] result = new int[arr.length];

        // Step 1: Store unique elements in a sorted map
        for (int num : arr) {
            map.put(num, 0);
        }

        // Step 2: Assign ranks
        int rank = 1;
        for (int key : map.keySet()) {
            map.put(key, rank++);
        }

        // Step 3: Replace elements with ranks
        for (int i = 0; i < arr.length; i++) {
            result[i] = map.get(arr[i]);
        }

        return result;
    }
}
