package Shekhar.Strings;

public class SB {
    public static void main(String[] args) {

        //StringBuilder creates a mutable string while pointing to the same object and same reference

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            sb.append(ch);
        }

        System.out.println(sb);
    }
}
