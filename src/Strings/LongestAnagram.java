package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LongestAnagram {

    public static List<List<String>> isLongestAnagram(String[] arr) {

        List<List<String>> list = new ArrayList<>();
        List<String> l = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                int[] charcount = new int[26];


            }
        }

        return list;
    }

    public static void main(String[] args) {
        String[]arr={"eat","tea","tan","ate","nat","bat"};
        System.out.println(isLongestAnagram(arr));
    }
}
