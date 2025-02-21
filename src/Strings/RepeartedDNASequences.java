package Strings;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class RepeartedDNASequences {

   public static List<String> validDNA(String s){

       List<String>l=new ArrayList<>();

      HashSet seen =new HashSet<>();
      HashSet rep=new HashSet<>();
String seq="";
       for(int i=0;i+9<s.length();i++){

           seq=s.substring(i,i+10);

           if(!seen.add(seq)){
              rep.add(seq);
           }


       }
       l.add(String.valueOf(rep));
       return l;
   }

    public static void main(String[] args) {
        String s="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(validDNA(s));
    }
}