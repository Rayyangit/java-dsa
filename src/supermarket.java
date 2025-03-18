import java.util.Scanner;

public class supermarket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=1;
         while(n > 0){
             int last=n % 10;
             res *= last;
             n /=10;
         }
        System.out.println(res);
    }
}
