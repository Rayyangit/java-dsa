package Strings;

public class longestcommonprefix {
    public static  String lgc(String []strs){
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (String s : strs)
            while (s.indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
        return prefix;
    }

    public static void main(String[] args) {
        String str[]={"flower","flow","float","dsa"};
        System.out.println(lgc(str));
    }
}
