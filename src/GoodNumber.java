import java.util.Scanner;

public class GoodNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isGood(n)){
            System.out.println("Good Number");
        }else{
            System.out.println("Bad Number");
        }
    }
    public static boolean isGood(int n){
        int temp=n;
        int sum=0;
        while(temp>0){
            sum += temp % 10;
            temp /= 10;
        }
        return n % sum ==0;
    }
}
