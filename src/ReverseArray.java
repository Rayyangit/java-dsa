public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        reverse(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void reverse(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left < right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
