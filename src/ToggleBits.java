import java.util.Scanner;

public class ToggleBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int mask=1;
        while(mask <= n){
            mask= mask << 1;
        }
        mask -= 1;
        int result= n ^ mask;
        System.out.println(result);
    }
}
