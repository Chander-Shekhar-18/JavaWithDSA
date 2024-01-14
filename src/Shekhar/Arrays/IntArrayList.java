package Shekhar.Arrays;

import java.util.ArrayList;

public class IntArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
//        Adding elements in the list
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
//        Printing elements of the list nums
        System.out.println(nums);
        System.out.println("Size of list nums is : " + nums.size());

//        Modifying an element in an array
        nums.set(0,225);

//        removing an element
        nums.remove(8);

//        iterating over a list using a for each loop
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();

//        iterating over a list using for loop
        for (int i = 0; i < nums.size(); i++)
            System.out.print(nums.get(i) + " ");
    }
}
