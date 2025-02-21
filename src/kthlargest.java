import java.util.PriorityQueue;
public class kthlargest {
    public static void main(String[] args){
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int ans=kthlargest(arr,k);
        System.out.println(ans);
    }
    public static int kthlargest(int[] arr,int k){
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        for(int num:arr){
            minheap.add(num);

        if(minheap.size()>k){
            minheap.poll();
        }
        }
        return minheap.peek();
    }
}
