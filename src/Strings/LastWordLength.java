package Strings;

public class LastWordLength {
    public static int lengthOfLastWord(String s) {


    String aa[]=s.split(" ");
     String p=aa[aa.length-1];
       return p.length();
    }

    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
