import java.util.Arrays;
import java.util.Scanner;
import  java.util.HashSet;
import java.util.Set;

public class KeywordSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();
        Set<String> keyword=new HashSet<>(Arrays.asList( "break", "case", "continue", "default", "defer", "else", "for",
                "func", "goto", "if", "map", "range", "return", "struct", "type", "var"));
        if(keyword.contains(input)){
            System.out.println(input + " is a keyword");
        } else {
            System.out.println(input + " is not a keyword");
        }

    }
}
