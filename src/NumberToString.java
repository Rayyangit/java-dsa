import java.util.Scanner;

public class NumberToString {
    // Arrays for words representation
    private static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
    private static final String[] teens = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
    private static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty",
            "Sixty", "Seventy", "Eighty", "Ninety" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        number(n);
        sc.close();
    }

    public static void number(int n) {
        if (n == 0) {
            System.out.println("Zero");
            return;
        }
        System.out.println(conversion(n).trim());
    }

    private static String conversion(int n) {
        String result = "";

        if (n >= 1000) {
            result += units[n / 1000] + " Thousand ";
            n %= 1000;
        }
        if (n >= 100) {
            result += units[n / 100] + " Hundred ";
            n %= 100;
        }
        if (n >= 20) {
            result += tens[n / 10] + " ";
            n %= 10;
        } else if (n >= 10) {
            result += teens[n - 10] + " ";
            return result;
        }
        if (n > 0) {
            result += units[n] + " ";
        }
        return result;
    }
}
