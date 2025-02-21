import java.sql.Struct;

public class missing {
    public static void main(String[] args){
        int [] arr={1,2,3,4,6};
        int ans=missing(arr);
        System.out.println(ans);
    }
    public static int missing(int[] arr){
        int n= arr.length+1;
        int total=n*(n+1)/2;
        int arraysum=0;
        for(int num:arr){
            arraysum += num;
        }
        return total-arraysum;
    }
}
