package Shekhar.Strings.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat" };
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (String str : strs){
            char[] charArray = str.toCharArray();
            System.out.println("Char Array : " + Arrays.toString(charArray));
            Arrays.sort(charArray);
            String newStr = new String(charArray);
            System.out.println(newStr);

            if(!hashMap.containsKey(newStr)){
                hashMap.put(newStr, new ArrayList<>());
                System.out.println("String added : " + newStr);

            }
            hashMap.get(newStr).add(str);
        }

        return new ArrayList<>(hashMap.values());
    }
}
