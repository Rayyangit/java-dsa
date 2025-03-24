public class CapitalizeFirstLast {
    public static void main(String[] args) {
        String str = "hello world java";
        System.out.println(capitalizeFirstLast(str));
    }

    public static String capitalizeFirstLast(String str) {
        char[] arr = str.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // Find the start of a word
            if (i == 0 || arr[i - 1] == ' ') {
                arr[i] = Character.toUpperCase(arr[i]);
            }
            // Find the end of a word
            if (i < n - 1 && arr[i + 1] == ' ') {
                arr[i] = Character.toUpperCase(arr[i]);
            }
            // If last character is a letter, capitalize it
            if (i == n - 1) {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        return new String(arr);
    }
}
