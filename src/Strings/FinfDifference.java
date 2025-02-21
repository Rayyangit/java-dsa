package Strings;

import java.util.Arrays;
import java.util.HashSet;

public class FinfDifference {

    public static char findDiff(String s,String t){
//        char c = 0;
//        for(char cs : s.toCharArray()) c ^= cs;
//        for(char ct : t.toCharArray()) c ^= ct;
//        return c;
        int ssum = 0;
        int tsum =0;
        for(int i=0;i<s.length();i++)
        {
            ssum = ssum + (int)s.charAt(i);
        }
        for(int i=0;i<t.length();i++)
        {
            tsum = tsum + (int)t.charAt(i);
        }
        int value = tsum - ssum;
        return (char)value;



    }

    public static void main(String[] args) {
String s="abcd";
        String t="abcde";
        System.out.println(findDiff(s,t));
    }
}
