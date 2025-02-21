public class sumofcubes {
    public static void main(String[] args){
        int n=4;
        int m=9;
        int ans=sumofcubes(n,m);
        System.out.println(ans);
    }
    public static int sumofcubes(int n, int m){
        int sum=0;
        for(int i=n;i<=m;i++){
            int cubes=i*i*i;
            sum += cubes;
        }
        return sum;
    }
}
