
public class PrimeNumberonCount {


    public static  boolean isPrime(int n){

        if(n<=1){
            return false;

        }

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int PrimeNum(int num){

        int count=0;
        int cn=2;
        while (true){
            if(isPrime(cn)){
                count++;
            }
            if(count==num){
                return cn;
            }
            cn++;
        }
    }
    public static void main(String[] args) {

        int num=8;
        System.out.println(PrimeNum(num));
    }
}