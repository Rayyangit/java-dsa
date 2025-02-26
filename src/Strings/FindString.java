package Strings;

public class FindString {


    public static int firstOcuurIndex(String hay,String n){
int count=0;
      int i=hay.indexOf(n);
      return i;

    }

    public static void main(String[] args) {
        String hay="sadsad";
        String n= "sad";
        System.out.println(firstOcuurIndex(hay,n));
    }
}
