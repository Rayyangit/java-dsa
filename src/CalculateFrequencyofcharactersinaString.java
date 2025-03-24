import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;


public class CalculateFrequencyofcharactersinaString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        frequency(str);
    }
    public static void frequency(String str){
        TreeMap<Character,Integer> map=new TreeMap<>();
        for(char ch: str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.print(entry.getKey()+"" +entry.getValue()+" ");
        }
    }
}
