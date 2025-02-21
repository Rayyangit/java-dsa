public class greater {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,10};
        int ans=maximum(arr);
        System.out.println(ans);
    }
    public static int maximum(int[] arr){
       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           max = arr[i];
       }
       return max;
    }
}
