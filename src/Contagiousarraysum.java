public class Contagiousarraysum {

    public static int Maxsum(int nums[]){

//        int res=nums[0];
//        int maxEnding=nums[0];
//        for(int i=1;i<nums.length;i++){
//
//            maxEnding=Math.max(maxEnding+nums[i],nums[i]);
//
//            res=Math.max(maxEnding,res);
//
//        }
//        return res;

        int curr=0;
        int max=0;

        for (int i=0;i<nums.length;i++){
            curr=curr+nums[i];

            if(curr>max){
                max=curr;
            }
            if(curr<0){
                curr=0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(Maxsum(arr));
    }
}
