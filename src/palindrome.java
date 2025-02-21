import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      boolean ans=isPalindrome(str);
      System.out.println(ans);
    }
    public static boolean isPalindrome(String str) {
        int l = 0;
        int r = str.length() - 1;
        while(l<r){
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;

    }
}
