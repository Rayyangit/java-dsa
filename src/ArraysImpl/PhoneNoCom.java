package ArraysImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneNoCom {

    public static List<String> Phoneno(String digits) {


        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        if (digits.length() == 0) {
            ArrayList<String> baseRes = new ArrayList<>();
            baseRes.add("");

            // Return an Arraylist containing
            // empty string
            return baseRes;
        }
        List<String> ls = new ArrayList<>();

        String s = "";
        if (digits.length() == 1) {
            s = map.get(digits.charAt(0));

            for (int i = 0; i < s.length(); i++) {
                ls.add(Character.toString(s.charAt(i)));
            }
        }
        char ch = digits.charAt(0);

        // Rest of the characters of str
        String restStr = digits.substring(1);

        ArrayList<String> prevRes = (ArrayList<String>) Phoneno(restStr);
        ArrayList<String> Res = new ArrayList<>();

        String code =map.get(ch);

        for (String val : prevRes) {

            for (int i = 0; i < code.length(); i++) {
                Res.add(code.charAt(i) + val);
            }
        }
        return Res;







}


    public static void main(String[] args) {
        String s="234";
        System.out.println(Phoneno(s));
    }
}
