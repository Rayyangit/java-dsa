package ArraysImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneNoCom
{

public static List<String> Phoneno(String digits){


    HashMap<Character,String>map=new HashMap<>();
    map.put('2',"abc");
    map.put('3',"def");
    map.put('4',"ghi");
    map.put('5',"jkl");
    map.put('6',"mno");
    map.put('7',"pqrs");
    map.put('8',"tuv");
    map.put('9',"wxyz");

    List<String>ls=new ArrayList<>();

    for(int i=0;i<digits.length();i++){

      char ch=  digits.charAt(i);

      ls.add(map.get(ch));
    }
return ls;
}


    public static void main(String[] args) {
        String s="23";
        System.out.println(Phoneno(s));
    }
}
