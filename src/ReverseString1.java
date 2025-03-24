import java.util.Scanner;

public class ReverseString1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        String ans=isReverse(str);
        System.out.println(ans);
    }
    public static String isReverse(String str) {
        StringBuilder sb = new StringBuilder();
        String[] words=str.trim().split("\\s+");
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i>0)sb.append(" ");
        }
        return sb.toString();
    }}

