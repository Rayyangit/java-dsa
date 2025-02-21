package Strings;

public class isomerphic {
    public static boolean isIsomorphic(String s, String t) {

    if(s.length()!=t.length()){
        return false;
    }
    int[]map1=new int[256];
    int [] map2=new int [256];

    for(int i=0;i<s.length();i++){
        if(map1[s.charAt(i)]!=map2[t.charAt(i)])
            return false;
        map1[s.charAt(i)]=i+1;
        map2[t.charAt(i)]=i+1;
    }
    return true;
}

    public static void main(String[] args) {
        String s="add";
        String t="egg";
        System.out.println(isIsomorphic(s,t));
    }
}
