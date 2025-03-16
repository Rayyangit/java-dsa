import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<Integer> getRow(int rowIndex) {
       List<Integer> row=new ArrayList<>();
       int val=1;
       row.add(val);
       for(int i=1;i<=rowIndex;i++){
           val=val*(rowIndex - i + 1)/i;
           row.add(val);
       }
       return row;
    }

    public static void main(String[] args) {
        int row = 4;
        System.out.println(getRow(row));  // Output: [1, 4, 6, 4, 1]
    }
}
