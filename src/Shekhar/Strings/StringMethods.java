package Shekhar.Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "CHANDER";

        System.out.println("Name in array format : " + Arrays.toString(name.toCharArray()));

        System.out.println("Name in LowerCase : " + name.toLowerCase());

        System.out.println("Index of e in name is : " + name.indexOf('E'));

        String name2 = "     chander     ";
        System.out.println("Name2 without blank spaces is : " + name2.strip());

        String st = "Chander Shekhar Akash Aishwarya";
        System.out.println("String is split by blank space : " + Arrays.toString(st.split(" ")));
    }
}
