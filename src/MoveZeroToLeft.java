public class MoveZeroToLeft {
    public static void main(String[] args) {
        int[] arr={4,0,2,0,1,8};
        isZero(arr);
    }
    public static void isZero(int[] arr){
        int right=arr.length-1;
        for(int left= arr.length-1;left>=0;left--){
            if(arr[left] != 0){
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                right--;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
