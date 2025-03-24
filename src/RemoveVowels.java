import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        String str= sc.nextLine();
        String ans=removevowels(str);
        System.out.println(ans);
    }
    public static String removevowels(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='u'){
                str=str.substring(0,i)+str.substring(i+1);
                i--;
            }
        }
        return str;
    }
}
