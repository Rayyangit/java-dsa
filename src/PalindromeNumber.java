import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isPalindrome(num)){
            System.out.println("It is Palindrome");
        }else{
            System.out.println("It is not a Palindrome");
        }
    }
    public static boolean isPalindrome(int num){
        int original=num;
        int reversed=0;
        while(num >0){
            int last=num  % 10;
            reversed = reversed * 10 + last;
            num /= 10;
        }
        return  original == reversed;

    }
}
