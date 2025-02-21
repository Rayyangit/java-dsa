import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class duplicates {
    public static void main(String[] args){
        int []arr={1,22,22,3,4,5};
        List<Integer>duplicatesa =duplicates(arr);
        for(int ele:duplicatesa){
            System.out.println(ele);
        }

    }
    public static List<Integer>  duplicates(int[] arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>result=new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>1){
                result.add(entry.getKey());
            }
        }
     if(result.isEmpty()){
         result.add(-1);
     }
     return result;
    }
}
