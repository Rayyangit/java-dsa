package Strings;

import java.util.ArrayList;

public class LargestNumber {

    public static String largestNo(int []nums){
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            arr.add(Integer.toString(nums[i]));
        }
        arr.sort((a,b)->{
            if((a+b).compareTo(b+a)>0) return -1;
            return 1;
        });
        String s = "";
        for(int i=0;i<arr.size();i++)
        {
            s+=arr.get(i);
        }
        if(s.charAt(0)=='0') return "0";
        return s;
    }

    public static void main(String[] args) {
        int nums[]={3,34,30,5,9};
        System.out.println(largestNo(nums));
    }
}
