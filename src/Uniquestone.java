import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Uniquestone {

    public static void isUniqueCount(int[][]stones){

        int count=0;
        if(stones.length==1){
            return ;
        }

for(int i=0;i<stones.length;i++){
    for(int j=0;j<stones[0].length;j++){
        System.out.println(stones[i][j]);
    }
}

    }

    public static void main(String[] args) {
        int arr[][]={{0,1},{1,0},{1,1}};
        int a[][]={{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}};
        isUniqueCount(a);
    }

}
