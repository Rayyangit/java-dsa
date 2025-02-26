package ArraysImpl;

import java.util.ArrayList;
import java.util.List;

public class generatePascal {

    public static List<List<Integer>> generate(int r){

        List<List<Integer>> result=new ArrayList<>();
        if(r==0)return result;

        List<Integer>row=new ArrayList<>();
        row.add(1);
        result.add(row);
        List<Integer>prev=row;
        for (int i=0;i<r;i++){

           List<Integer>curr=new ArrayList<>();
           curr.add(1);

           for (int j=1;j<i;j++){

               curr.add(prev.get(j)+prev.get(j-1));
           }

          curr.add(1);
           result.add(curr);
           prev=curr;

        }
        return result;
    }

    public static void main(String[] args) {
        int r=3;
        List<List<Integer>>l=generate(r);

        for (List<Integer> row : l) {
            System.out.println(row);
        }

    }
}
