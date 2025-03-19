import java.util.Scanner;

public class Addelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int last = num % 10;
            sum += last;
            num /= 10;

        }
        System.out.println(sum);
    }
}
