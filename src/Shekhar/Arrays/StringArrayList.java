package Shekhar.Arrays;

import java.util.ArrayList;

public class StringArrayList {
    public static void main(String[] args) {
        // create ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // Add elements to ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("Swift");
        System.out.println("ArrayList: " + languages);

        // get the element from the arraylist
        String str = languages.get(0);
        System.out.println("Language at index 0 is : " + str);
        System.out.println();

        // change the element of the array list
        languages.set(2, "JavaScript");
        System.out.println("Modified ArrayList: " + languages);
        System.out.println();

        // remove element from index 2
        String str2 = languages.remove(2);
        System.out.println("Updated ArrayList: " + languages);
        System.out.println("Removed Element: " + str2);
    }
}
