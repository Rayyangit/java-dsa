import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPerfect(n)){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a Perfect Number");
        }
    }
    public static boolean isPerfect(int n){
        if(n <= 1)return false;
        int sum=1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i==0){
                sum += i;
                if(i != n/i){
                    sum += n/i;
                }
            }
        }
        return sum==n;
    }
}
