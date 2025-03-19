import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> res=removeduplicates(arr);
            for (int num : res) {
                System.out.print(num + " ");
        }
    }
    public static  ArrayList<Integer> removeduplicates(int[] arr){

            ArrayList<Integer> result = new ArrayList<>();
            HashSet<Integer> removed=new HashSet<>();
            for(int num: arr){
                if(!removed.contains(num)){
                    removed.add(num);
                    result.add(num);
                }
            }
            return result;
        }
}
