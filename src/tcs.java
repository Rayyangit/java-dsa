import java.util.Map;
import java.util.Scanner;

public class tcs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arrn=n*(n+1)/2;
        int arrm=m*(m+1)/2;
        int res= Math.abs(arrn-arrm);
        System.out.println(res);
    }
}
