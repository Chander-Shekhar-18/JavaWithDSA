package Shekhar.Strings.Questions;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(]";
        System.out.println(isValidByStack(s));
    }

    public static boolean isValidByStack(String s) {
        char[] sArr = s.toCharArray();

        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            if(sArr[i] == '(' || sArr[i] == '{' || sArr[i] == '[')
                charStack.push(sArr[i]);
            else{
                char topEle = charStack.pop();
                if ((sArr[i] == ')' && topEle != '(') || (sArr[i] == '}' && topEle != '{') || (sArr[i] == ']' && topEle != '[')){
                    return false;
                }
            }
        }
        return charStack.isEmpty() ? true : false;
    }

    public boolean isValid(String s){
        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else {
                return s.isEmpty();
            }
        }
    }
}
