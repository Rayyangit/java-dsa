import java.util.Arrays;

class RemoveLeadingZero {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 2, 2, 0};
        sortArr(arr); // Now correctly calling a static method
    }

    public static void sortArr(int[] arr) { // Made static
        Arrays.sort(arr); // Sorts the array in ascending order

        // Find the index of the first non-zero element
        int index = 0;
        while (index < arr.length && arr[index] == 0) {
            index++;
        }

        // Print the array without leading zeros
        for (int i = index; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
