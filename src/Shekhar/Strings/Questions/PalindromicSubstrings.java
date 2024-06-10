package Shekhar.Strings.Questions;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        String str = "aaa";
        System.out.println(countSubstrings(str));
    }
    public static int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++){
            count += expandAroundCorners(s, i, i);
            count += expandAroundCorners(s, i, i + 1);
        }
        return count;
    }
    public static int expandAroundCorners(String str, int left, int right){
        int count = 0;

        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
            count++;
        }

        return count;
    }
}
