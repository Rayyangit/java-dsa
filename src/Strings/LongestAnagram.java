package Strings;

import java.util.*;

public class LongestAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        // Group words by their sorted character representation
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            map.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        // Convert map values to a list of lists
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}
