public class sumoftables {
    public static void main(String[] args){
        int n=10;
        int ans=sumoftables(n);
        System.out.println(ans);
    }
    public static int sumoftables(int n){
        int sum=0;
        for(int i=1;i<=10;i++){
            sum += n*i;
        }
        return sum;
    }
}
