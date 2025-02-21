import java.util.HashMap;

public class sumequaltarget {
    public  static void main(String[]args){
        int [] arr={3,4,-7,1,3,3,1,-4};
        int target=7;
        int ans=sumequaltarget(arr,target);
        System.out.println(ans);
    }
    public static int sumequaltarget(int[]arr,int target){
        int currsum=0;
        int count=0;
        HashMap<Integer,Integer> sum=new HashMap<>();
        sum.put(0,1);
        for(int num:arr){
            currsum += num;
            if(sum.containsKey(currsum-target)){
                count += sum.get(currsum-target);
            }
            sum.put(currsum,sum.getOrDefault(currsum,0)+1);

        }
        return count;
    }
}
