package ArraysImpl;
import java.util.*;
public class RemoveDuplicates {
 public static int[] removeDuplicates(int nums[]){
        Map<Integer, Integer> countMap = new HashMap<>();
// Count occurrences of each element
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
 // Collect elements that appear only once
        List<Integer> resultList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if(entry.getValue()==1){
                resultList.add(entry.getKey());
            }
        }
        // Convert list to array
        int[] arr = resultList.stream().mapToInt(i -> i).toArray();
      return arr;
    }
     public static void main(String[] args) {
        int arr[]={1,2,5,6,5,2};
       for (int num:removeDuplicates(arr)){
           System.out.println(num);
       }
    }
}
