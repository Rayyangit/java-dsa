package ArraysImpl;

import java.util.ArrayList;

public class Gcf {

    static int gcd(int a, int b)
    {
        // if b=0, a is the GCD
        if (b == 0)
            return a;

            // call the gcd() method recursively by
            // replacing a with b and b with
            // difference(a,b) as long as b != 0
        else
            return gcd(b, Math.abs(a - b));
    }
    public static int absgcf(int nums[]){

        ArrayList<Integer>ls=new ArrayList<>();
int maxsum=nums[0];
int diff=0;
for(int i=1;i<nums.length;i++){
    maxsum=Math.max(nums[i],maxsum);
    diff=nums[i]-nums[i-1];
    ls.add(diff);
    diff=0;


}
int sumofdiff=0;
for(int n:ls){
    sumofdiff=Math.abs(n+sumofdiff);
}

return gcd(maxsum,sumofdiff) ;
    }

    public static void main(String[] args) {
        int nums[]={5,4,5,6,7,-2};
        System.out.println(absgcf(nums));
    }
}
