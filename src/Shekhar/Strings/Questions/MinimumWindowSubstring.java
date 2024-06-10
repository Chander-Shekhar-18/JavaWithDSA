package Shekhar.Strings.Questions;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }
    public static String minWindow(String s, String t) {
        String ans = "";

        if (s == null || t == null || s.length() < t.length())
            return "";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        int match = 0;
        int desiredMatch = t.length();

        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        int i = -1;
        int j = -1;

        while (true){
            boolean flag1 = false;
            boolean flag2 = false;

            while (i < s.length() - 1 && match < desiredMatch){
                i++;
                hashMap2.put(s.charAt(i), hashMap2.getOrDefault(s.charAt(i), 0) + 1);

                if (hashMap2.getOrDefault(s.charAt(i), 0) <= map.getOrDefault(s.charAt(i), 0)) {
                    match++;
                }

                flag1 = true;
            }

            while (j < i && match == desiredMatch){
                String tempAns = s.substring(j + 1, i + 1);
                if (ans.length() == 0 || tempAns.length() < ans.length()){
                    ans = tempAns;
                }
                j++;

                if (hashMap2.get(s.charAt(j)) == 1)
                    hashMap2.remove(s.charAt(j));
                else
                    hashMap2.put(s.charAt(j), hashMap2.get(s.charAt(j)) - 1);

                if (hashMap2.getOrDefault(s.charAt(j), 0) < map.getOrDefault(s.charAt(j), 0))
                    match--;

                flag2 = true;
            }

            if (flag1 == false || flag2 == false)
                break;
        }

        return ans;
    }
}
