import java.util.HashMap;
import java.util.Scanner;

public class Frequencyofeachelementinthearray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            System.out.print(freqMap.get(num) + " ");
        }
        System.out.println();
    }
}
