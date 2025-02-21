public class prime {
    public static void main(String[] args){
        int n=7;
        int ans=Fib(n);
        System.out.println(ans);

    }
    public static int Fib(int n){
        int a=0;
        int b=1;
        int c=n;
        for(int i=2;i<n;i++){
             c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}
