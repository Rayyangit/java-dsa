import java.util.Scanner;

public class VehicleManufacturing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v= sc.nextInt();
        int w= sc.nextInt();
        String ans=VehicleManufacturing(v,w);
        System.out.println(ans);
    }
    public static String VehicleManufacturing(int v, int w){
        int x=(4* v - w)/2;
        int y=v-x;
        if(w % 2 ==1 || x< 0|| y < 0){
            return "-1";
        }else{
            return x + " " +y;
        }
    }
}
