public class FibonacciSeriesuptoNthterm {
    public static void main(String[] args) {
        int n= 6;
        int a=0;
        int b=1;
        int c;
        if(n==0){
            System.out.println(0);
        }
        System.out.print(a + " "); // Print first Fibonacci number
        if (n > 1) {
            System.out.print(b + " "); // Print second Fibonacci number
        }
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
}
