import java.util.Scanner;

public class VowelsandConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        isVowels(str);
    }
    public static void isVowels(String str){
        int vowels=0 ,consonant=0,whitespaces=0;
        str=str.toLowerCase();
        for(int i=0;i <str.length();i++){
        char ch=str.charAt(i);
        if(ch == 'a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            vowels++;
        }
          else  if (ch >= 'a' && ch <= 'z') {
                consonant++;
            }else if(ch == ' '){
              whitespaces++;
        }

        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonant);
        System.out.println("White spaces: " + whitespaces);
    }
}
