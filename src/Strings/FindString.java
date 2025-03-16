package Strings;

public class FindString {


    public static int firstOcuurIndex(String hay,String n){
        return hay.indexOf(n);

    }

    public static void main(String[] args) {
        String hay="sadsad";
        String n= "sad";
        System.out.println(firstOcuurIndex(hay,n));
    }
}
