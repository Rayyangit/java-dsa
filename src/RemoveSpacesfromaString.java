import java.util.Scanner;

public class RemoveSpacesfromaString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        String ans=remove(str);
        System.out.println(ans);
    }
    public static String remove(String str){
        StringBuilder sb=new StringBuilder();
        for(char ch: str.toCharArray()) {
            if (ch != ' ') {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
