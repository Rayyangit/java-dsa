package Strings;

public class ZigzagConversion {

    public static String convert(String s,int numRows){
        if (numRows == 1) return s;
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += (2 * (numRows - 1))) {
                a.append(s.charAt(j));
                if (i > 0 && i < numRows - 1 && j + (2 * (numRows - 1)) - (2 * i) < s.length()) {
                    a.append(s.charAt(j + (2 * (numRows - 1)) - (2 * i)));
                }
            }
        }
        return a.toString();
    }

    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        int num=3;
        System.out.println(convert(s,num));
    }
}
