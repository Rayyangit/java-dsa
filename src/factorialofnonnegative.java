import java.util.Scanner;

public class factorialofnonnegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            return;
        }
        long ans=factorial(n);
        System.out.println(ans);
    }
    public static long factorial(int n){
      if(n==0) return 1;
      return n * factorial(n-1);
    }
}
