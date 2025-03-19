import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline to avoid skipping input

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine(); // Properly read input
        }

        System.out.println(common(str));
        sc.close();
    }

    public static String common(String[] str) {
        if (str == null || str.length == 0) { // Fix placement
            return "-1";
        }

        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length - 1];

        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return i == 0 ? "-1" : first.substring(0, i);
    }
}
