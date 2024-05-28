package Shekhar.Strings.Questions;

public class Palindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
//        int i = str.charAt(str.length() - 1);
//        System.out.println(i);
//        System.out.println(str.charAt(str.length() - 1));
        System.out.println(isPalindrome(str));

//        System.out.print(checkPlindrome(str));
    }

//    static boolean isPalindrome (String str) {
//        if (str == null || str.length() == 0)
//            return true;
//
//        str = str.toLowerCase();
//
//        for (int i = 0; i <= str.length() / 2; i++){
//            char start = str.charAt(i);
//            char end = str.charAt(str.length() - 1 - i);
//
//            if (start != end)
//                return false;
//        }
//        return true;
//    }

    static boolean checkPlindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            // Move end pointer until it finds an alphanumeric character
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            // If valid characters are found, compare them
            if (start < end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }

}















