import java.util.Scanner;

public class NumberToString1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=String.valueOf(n);
convert(str);
        System.out.println();

    }
     static void convert(String str){
for(int i=0;i< str.length();i++){
    int digit=str.charAt(i) -'0';
    System.out.print(units[digit] + " ");
}
    }
    private static  final String[] units={"zero","one","two","three","four","five","six","seven","eight","nine"};
}
