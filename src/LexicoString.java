import java.util.HashMap;

public class LexicoString {

    public static String lecioSt(String num) {
        char[] ch = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder s = new StringBuilder();
        int i = 0;

        while (i < num.length()) {
            int c = num.charAt(i) - '0';

            // Check if we can form a valid two-digit number (10-25)
            if (i + 1 < num.length()) {
                int n = num.charAt(i + 1) - '0';
                int combined = c * 10 + n;

                if (combined <= 25) {
                    s.append(ch[combined]);
                    i += 2; // Skip the next digit
                    continue;
                }
            }

            // If no valid two-digit number, append the single digit mapping
            s.append(ch[c]);
            i++;
        }

        return s.toString();
    }

    public static void main(String[] args) {
        String num = "14";
        System.out.println(lecioSt(num));

      
        // Expected output based on your mapping logic
    }
}
