package Shekhar.Strings.Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        String str1 = strs[0];
        String str2 = strs[strs.length - 1];

        System.out.println(str1 + "-" + str2);

        System.out.println(longestCommonPrefix(strs));
    }

//    public static String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0) return "";
//
//        String prefix = strs[0];
//
//        for (int i = 1; i < strs.length; i++){
//            while (strs[i].indexOf(prefix) != 0){
//                prefix = prefix.substring(0, prefix.length() - 1);
//                System.out.println(prefix);
//            }
//        }
//        return prefix;
//    }

    public static String longestCommonPrefix (String[] strs) {
        
        if (strs.length == 0) return "";

        Arrays.sort(strs);

        String str1 = strs[0];
        String str2 = strs[strs.length - 1];

        int index = 0;

        while ( index < str1.length()){
                if (str1.charAt(index) == str2.charAt(index)){
                    index ++;
                }else {
                    break;
                }
        }
        return str1.substring(0, index);
    }
}
