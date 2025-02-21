import java.util.Stack;

public class ValidParan {

    public static boolean validParan(String s){

        int maxcount=0;
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == '(') {
                st.push(')');

            }

            if (s.charAt(i) == '*') {
                maxcount++;
            } else if (st.isEmpty() || st.pop() != s.charAt(i)) {

                return false;
            }

            
        }



        return st.isEmpty();
    }

    public static void main(String[] args) {
        String  s = "*)()";
        System.out.println(validParan(s));
    }
}
