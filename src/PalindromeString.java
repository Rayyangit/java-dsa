import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (isPalindrome(str)) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
            return true;

    }
}
