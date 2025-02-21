public class uniqueelents {
    public static void main(String[] args){
      int []arr={1,3,2,3,2,4};
      int ans=Uniqueelements(arr);
      System.out.println(ans);
    }
    public static int Uniqueelements(int[] arr){
        int sum=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                sum += arr[i];
            }
        }
        return sum;
    }
}
