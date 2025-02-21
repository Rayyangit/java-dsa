public class anagram {
    public static void main(String[] args){
        String str1="listen";
        String str2="silent";
        boolean ans=isAnagram(str1,str2);
        System.out.println(ans);
    }
    public static boolean isAnagram(String str1,String str2){
        if(str1.length() != str2.length()){
            return  false;
        }
        int[] charcount=new int[26];
        for(int i=0;i<str1.length();i++){
            charcount[str1.charAt(i) -'a']++;
            charcount[str2.charAt(i)-'a']--;
        }
        for(int count:charcount){
            if(count !=0){
                return false;
            }
        }
        return true;
    }
}
