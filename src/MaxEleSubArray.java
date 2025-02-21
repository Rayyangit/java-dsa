import java.util.Arrays;
import java.util.Map;

public class MaxEleSubArray {

    public static int contagiousArray(int arr[]){

//        int sum=arr[0];
//
//
//        for(int i=0;i<arr.length;i++){
//            int currsum=0;
//          for (int j=i;j<arr.length;j++){
//              currsum=currsum+arr[j];
//              sum=Math.max(sum,currsum);
//          }
//
//
//
//        }
//        return sum;

        int res=arr[0];
        int maxend=arr[0];

        for (int i=1;i<arr.length;i++){

            maxend= Math.max(maxend+arr[i],arr[i]);

            res=Math.max(res,maxend);
        }
        return res;




    }

    public static void main(String[] args) {
        int arr[]={2, 3, -8, 7, -1, 2, 3};
        System.out.println(contagiousArray(arr));
    }
}
