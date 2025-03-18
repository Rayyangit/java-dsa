import java.util.Scanner;

public class daystosunday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the starting day correctly
        String str = sc.next();
        int n = sc.nextInt();  // Read the number of days
        sc.close();

        // Array representing the days of the week
        String[] arr = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};

        int startIndex = 0;

        // Find the index of the starting day
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(str)) {  // Make it case-insensitive
                startIndex = i;
                break;
            }
        }

        // Calculate days until first Sunday
        int daysToFirstSunday = (7 - startIndex) % 7;
        if (daysToFirstSunday == 0) daysToFirstSunday = 7;

        // Calculate total Sundays
        int countSundays = 0;
        if (n >= daysToFirstSunday) {
            countSundays = 1 + (n - daysToFirstSunday) / 7; // First Sunday + additional Sundays
        }

        // Output the result
        System.out.println(countSundays);
    }
}
