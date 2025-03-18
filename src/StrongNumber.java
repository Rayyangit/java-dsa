import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isStrong(num)){
            System.out.println("It is a Strong Number");
        }else{
            System.out.println("It is not a Strong Number");
        }
    }
    public static boolean isStrong(int num){
        int original=num ,sum=0;
        while(num > 0){
            int last=num %10;
            sum += factoroal(last);
            num /= 10;
        }
        return  sum == original;
    }
    public  static int factoroal(int n){
        int fact=1;
        for(int i=1;i<= n;i++){
            fact *= i;
        }
        return fact;
    }
}
