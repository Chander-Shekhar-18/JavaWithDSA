package Shekhar.SearchingAndSorting.Questions;

public class SearchingInString {
    public static void main(String[] args) {
        String name = "chander";
        char target = 'l';
        System.out.println("is " + target + " present is the string or not : " + presentOrNot(name, target));
    }
    static boolean presentOrNot(String str, int target) {
        if (str.isEmpty())
            return false;

        for (int i = 0; i < str.length(); i++)
            if (target == str.charAt(i))
                return true;

        return false;
    }
}
