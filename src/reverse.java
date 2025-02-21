import com.sun.source.tree.BreakTree;

import java.sql.Struct;
import java.util.Scanner;
public class reverse {
    public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String ans=reverse(str);
      System.out.println(ans);
    }
    public static String reverse(String str){

//        return new StringBuilder(str).reverse().toString();
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            result += str.charAt(i);
        }
        return result;
    }

}
