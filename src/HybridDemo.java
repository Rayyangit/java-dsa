import java.util.Scanner;

interface NumberOperations {
    void greaterNo();
    void smallestNo();
}

class BaseClass {
    Scanner sc = new Scanner(System.in);
    int[] num;
    int size, i;

    public void accept() {
        System.out.println("Enter the size:");
        size = sc.nextInt();
        num = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Numbers are:");
        for (i = 0; i < size; i++) {
            System.out.println(num[i]);
        }
    }
}

class NumberProcessing extends BaseClass implements NumberOperations {
    public void greaterNo() {
        int grt = num[0];
        for (i = 0; i < size; i++) {
            if (grt < num[i]) {
                grt = num[i];
            }
        }
        System.out.println("The greatest number is: " + grt);
    }

    public void smallestNo() {
        int smt = num[0];
        for (i = 0; i < size; i++) {
            if (smt > num[i]) {
                smt = num[i];
            }
        }
        System.out.println("The smallest number is: " + smt);
    }
}

class SortingOperations extends NumberProcessing {
    public void ascProcess() {
        int temp;
        for (i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("Ascending order:");
        for (i = 0; i < size; i++) {
            System.out.println(num[i]);
        }
    }

    public void descProcess() {
        int temp;
        for (i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (num[i] < num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("Descending order:");
        for (i = 0; i < size; i++) {
            System.out.println(num[i]);
        }
    }
}

public class HybridDemo extends SortingOperations {
    public void sumOfNumbers() {
        int sum = 0;
        for (i = 0; i < size; i++) {
            sum += num[i];
        }
        System.out.println("The sum of all numbers is: " + sum);
    }

    public static void main(String[] args) {
        HybridDemo obj = new HybridDemo();
        obj.accept();
        obj.greaterNo();
        obj.accept();
        obj.smallestNo();
        obj.accept();
        obj.ascProcess();
        obj.accept();
        obj.descProcess();
        obj.accept();
        obj.sumOfNumbers();
    }
}
