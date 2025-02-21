public class KadaneAlgorithm {

    public static int conatagious(int []arr){
int maxEnd=arr[0];
int res=arr[0];

        for(int i=0;i< arr.length;i++){

             maxEnd=Math.max(maxEnd+arr[i],arr[i]);
res=Math.max(res,maxEnd);

        }
        return res;
    }
    public static void main(String[] args) {
int arr[]={1,23,5,-2,-6,2};
        System.out.println(conatagious(arr));
    }
}
