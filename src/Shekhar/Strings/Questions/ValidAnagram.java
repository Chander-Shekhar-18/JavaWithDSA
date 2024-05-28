package Shekhar.Strings.Questions;

import java.util.Arrays;
import java.util.Stack;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] charCounts = new int[26];

        for (int i = 0; i < s.length(); i++){
            charCounts[s.charAt(i) - 'a'] += 1;
            charCounts[t.charAt(i) - 'a'] -= 1;
        }

        for (int count : charCounts){
            if (count != 0) return false;
        }

        return true;
    }
}