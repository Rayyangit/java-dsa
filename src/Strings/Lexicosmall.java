package Strings;

import java.util.*;

public class Lexicosmall {
    public static String Lexicosmall(String s){
        int[] cnt = new int[26];

        // Mark visited characters
        boolean []seen=new boolean[26];

        int n = s.length();
Stack<Integer>ch=new Stack<>();
        // Stores count of each character
        for(int i = 0; i < n; i++)
            cnt[s.charAt(i) - 'a']=i;

        // Stores the resultant string
        String res = "";

        for(int i = 0; i < n; i++)
        {
int curr=s.charAt(i)-'a';
            // Decrease the count of
            // current character
            if(seen[curr]) {

                continue;
            }
            while (!ch.isEmpty() && ch.peek()>curr&&  i < cnt[ch.peek()]){
               seen[ch.pop()]=false;
            // If character is not already
            // in answer

            }
            ch.push(curr); // add into stack
            seen[curr] = true;

        }
        StringBuilder st=new StringBuilder();

        StringBuilder sb = new StringBuilder();
        while (!ch.isEmpty())
            sb.append((char) (ch.pop() + 'a'));
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s="bcabc";
        System.out.println(Lexicosmall(s));
    }
}
