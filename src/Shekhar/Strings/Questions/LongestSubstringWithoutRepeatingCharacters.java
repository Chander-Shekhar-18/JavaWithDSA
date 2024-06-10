package Shekhar.Strings.Questions;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxLength = 0;

        List<Character> list = new ArrayList<>();

        while (end < s.length()) {
            if (!list.contains(s.charAt(end))) {
                System.out.println("Value added : " + s.charAt(end));
                list.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, list.size());
            } else {
                System.out.println("Value removed : " + s.charAt(start));
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }

        return maxLength;
    }
}
