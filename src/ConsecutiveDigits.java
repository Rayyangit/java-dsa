import java.util.HashMap;

public class ConsecutiveDigits {

    public static int maxcons(int arr[]){

       int count=0;
int g=1;
int maxCount=0;

for(int i=0;i<arr.length;i++){
    if(arr[i]==g){
        count++;
    }else{
        count=0;
    }
    maxCount=Math.max(count,maxCount);
}
return maxCount;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,1,1,0,1};

        System.out.println(maxcons(arr));
    }
}
