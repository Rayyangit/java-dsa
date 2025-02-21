public class maximumelement {
    public static void main(String[] args){
        int[] arr={1,4,68,88,4};
        int ans=maximumelement(arr);
        System.out.println(ans);

    }
    public static int maximumelement(int [] arr){
        int max=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                second=max;
                max=arr[i];
            } else if (arr[i]<max && arr[i]>second) {
              second=arr[i];
            }

        }
        return second;
    }
}
