import java.util.Scanner;

public class lcmoftwonumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int res=1;

        for(int i=2;i<=Math.max(a,b);i++){
            while (a % i==0 || b % i ==0){
                res *= i;
                if(a % i==0) a /= i;
                if(b % i==0) b /= i;
            }
        }
        System.out.println(res);
    }
}
