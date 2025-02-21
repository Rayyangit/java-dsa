public class CountPrimeNo {

    public static boolean isPrime(int n){

        if(n<=1){
            return false;
        }
        for (int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int countPrime(int num){

        int count=0;

        for(int i=2;i<=num;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num=15;
        System.out.println(countPrime(num));
    }
}
