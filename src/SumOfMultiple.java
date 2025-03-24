public class SumOfMultiple {
    public static void main(String[] args) {
        int n=10;

        int sum=0;
        for(int i=1;i<=n;i++){
            int total =n * i;
            sum += total;
        }
        System.out.println(sum);
    }
}
