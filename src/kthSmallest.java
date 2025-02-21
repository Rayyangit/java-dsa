import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Collections;
public class kthSmallest {
    public static void main(String[] args){
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
    int ans=kthsmallest(arr,k);
        System.out.println(ans);
}
public static int kthsmallest(int[] arr,int k) {
    PriorityQueue<Integer> minheap = new PriorityQueue<>(Collections.reverseOrder());
    for (int num : arr) {
        minheap.add(num);

        if (minheap.size() > k) {
            minheap.poll();
        }
    }
    return minheap.peek();
}
}
