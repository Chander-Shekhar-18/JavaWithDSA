package Shekhar.Strings.Questions;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabbcc";
        System.out.println(removeConsecutiveCharacter(str));
    }
    public static String removeConsecutiveCharacter(String S){
        String newStr = "";

        for (int i = 0; i < S.length(); i++) {
            if (newStr.isEmpty() || S.charAt(i) != newStr.charAt(newStr.length() - 1)){
                newStr += S.charAt(i);
            }
        }
        return newStr;
    }
}
