import java.util.Scanner;

public class MovesZerostoEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int left=0;
        for(int right=0;right<n;right++){
            if(arr[right] != 0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
            }
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
