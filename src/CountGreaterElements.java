import java.util.Scanner;

public class CountGreaterElements {
    public static void main(String[] args) {
        int []arr={7, 4, 8, 2, 9};
        int ans=greater(arr);
        System.out.println(ans);
    }
    public static int greater(int[]arr){
        int max=arr[0];
        int count=1;
        for(int i=0;i< arr.length;i++){
           if(arr[i]>max){
               count++;
               max=arr[i];
           }
        }
        return count;
    }
}
