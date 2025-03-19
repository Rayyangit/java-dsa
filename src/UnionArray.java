import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;

public class UnionArray {
    public static void main(String[] args) {
        int[] arr1={4,7,8,9,6};
        int [] arr2={1,2,3,5};
       List<Integer> ans=union(arr1,arr2);
        System.out.println(ans);
    }
    public static List<Integer>  union(int [] arr1,int[] arr2){
        Set<Integer> union=new TreeSet<>();
        for(int num:arr1){
            union.add(num);
        }
        for(int num: arr2){
            union.add(num);
        }
        return new ArrayList<>(union);
    }
}
