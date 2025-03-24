import java.util.Scanner;

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=sumofprime(n);
        System.out.println(ans);
    }
    public static  boolean isPrime(int n){
        if(n==0||n==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i==0){
                return false;
            }
        }
        return true;
    }
    public static int sumofprime(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }
}
