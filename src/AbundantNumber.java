import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (isAbundant(n)) {
            System.out.println("It is a Abundant NUmber");
        }else{
            System.out.println("Not a Abundant Number");
        }
    }
    public static boolean isAbundant(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n % i ==0){
                sum += i;
            }


        }
        return sum > n;
    }
}
