import java.util.Scanner;

public class CountPairsDivisibleby2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t--> 0) {
            // Your code goes here
            int n=scanner.nextInt();
            int [] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            long ans=div(arr);
            System.out.println(ans);
        }
    }
    public static long div(int [] arr){
        long odd=0, even=0;
        for(int num : arr){
            if(num % 2==0){
                even++;
            }else{
                odd++;
            }

        }
        long oddpair=(odd * (odd - 1))/2;
        long evenpair=(even * (even - 1))/2;
        long total= evenpair + oddpair;
        return total;
    }
}
