public class SmallestElementArray {
    public static void main(String[] args) {
        int[] arr={4,444,445,2,3,4,4,5,6};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
