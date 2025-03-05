interface AverageCalculator {
    void averageOfN(int[] numbers);
}

class A {
    void primeAndArmstrong() {
        System.out.println("Prime numbers and Armstrong numbers from 1 to 1000:");
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.println("\nArmstrong Numbers: ");
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i)) System.out.print(i + " ");
        }
        System.out.println();
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    private boolean isArmstrong(int num) {
        int original = num, sum = 0, digits = String.valueOf(num).length();
        while (original > 0) {
            int digit = original % 10;
            sum += Math.pow(digit, digits);
            original /= 10;
        }
        return sum == num;
    }
}

class B extends A implements AverageCalculator {
    public void averageOfN(int[] numbers) {
        int sum = 0;
        for (int num : numbers) sum += num;
        double average = (double) sum / numbers.length;
        System.out.println("Average of N numbers: " + average);
    }
}

class C extends A {
    void swapNumbers(int a, int b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}

class D extends C implements AverageCalculator {
    public void averageOfN(int[] numbers) {
        new B().averageOfN(numbers);
    }

    void fibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        D obj = new D();
        obj.primeAndArmstrong();
        obj.averageOfN(new int[]{10, 20, 30, 40, 50});
        obj.swapNumbers(5, 10);
        obj.fibonacciSeries(10);
    }
}
