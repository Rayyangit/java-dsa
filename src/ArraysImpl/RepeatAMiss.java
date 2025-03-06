package ArraysImpl;

import java.util.HashMap;
import java.util.HashSet;

public class RepeatAMiss {

    public static int[] repeat_miss(int [][]a){

        int []arr=new int[2];
        HashSet<Integer> rep=new HashSet<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        int max=a[0][0];
        int min =a[0][0];
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                max = Math.max(max, a[i][j]);
                min = Math.min(min, a[i][j]);
                if (!rep.add(a[i][j])) {
                    arr[0] = a[i][j];
                }


            }

        }

       for (int i=1;i<=max;i++){
           if(!rep.contains(i)){
               arr[1]=i;
           }

       }
if(arr[1]==0)
       arr[1]=a.length*a.length;

        return arr;
    }
    public static void main(String[] args) {

        int [][]a={{9,1,7},{8,9,2},{3,4,6}};
        int arr[]=repeat_miss(a);
       for (int i=0;i< arr.length;i++){
           System.out.println(arr[i]);
       }
    }
}
