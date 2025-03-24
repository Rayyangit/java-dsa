import java.util.Scanner;

public class largestwordinaString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String answer=isLargest(str);
        System.out.println(answer);
    }
    public static String isLargest(String str){
        String[] words=str.split("\\s+");
        String largest="";
        int max=0;
        for(String word:words){
            if(word.length()>max){
                max=word.length();
                largest=word;
            }
        }
        return largest;
    }
}
