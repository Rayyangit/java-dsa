import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (isHarshad(n)) {
            System.out.println("It is a Harshad NUmber");
        }else{
            System.out.println("Not a Harshad Number");
        }
    }
    public static boolean isHarshad(int n){
        int original=n;
        int sum=0;
        while(original > 0){
            int digit=original % 10;
            sum += digit;
            original /= 10;

        }
        return n % sum ==0;
    }
}
