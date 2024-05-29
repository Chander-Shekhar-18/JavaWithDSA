package Shekhar.Hashmap;

import java.util.HashMap;

public class Intro {
    public static void main(String[] args) {
        String name = "Shekhar";
        System.out.println("Hashcode value of " + name + " is : " + name.hashCode());

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Chander", 100);
        map.put("Shekhar", 55);
        map.put("Sachin", 56);
        map.put("Sachin1", 56);

        System.out.println("The key value pair of map is : " + map);

        // We can get item of HashMap by .get() method
        System.out.println("Marks of Chander is : " + map.get("Chander"));

        // We can check weather a key is present or not
        System.out.println("Sachin is present in map or not : " + map.containsKey("Sachin"));
        System.out.println("Harish is present in map or not : " + map.containsKey("Harish"));

        // We can check weather a value is present or not
        System.out.println("is " + 100 + " present in the map or not ? : " + map.containsValue(100));
        System.out.println("is " + 99 + " present in the map or not ? : " + map.containsValue(99));

    }
}
