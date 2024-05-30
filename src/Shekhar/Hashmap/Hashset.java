package Shekhar.Hashmap;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        // Adding elements in the HashSet
        for (int i = 0; i < 10; i++)
            hashSet.add(i);

        System.out.println("HashSet is : " + hashSet);

        // HashSet using iterator
        for (Integer integer : hashSet) {
            System.out.print(integer + ", ");
        }
        System.out.println();

        // It removes the element
        boolean isRemoved = hashSet.remove(0);
        System.out.println("is item removed ? " + isRemoved);

        // It removes all the elements
        boolean isAllRemoved = hashSet.removeAll(hashSet);
        System.out.println("is all the items are removed ? " + isAllRemoved);
        System.out.println("Empty list after removeAll() : " + hashSet);

        // isEmpty() checks weather is list is empty or not, it returns the boolean value
        System.out.println("is HashSet empty ? " + hashSet.isEmpty());

        // This will add two hashset together
        unionOfHashSet();

        // This will return intersection of two sets
        intersectionOfHashSet();

        System.out.println("Size of hashSet is : " + hashSet.size());
    }

    public static void unionOfHashSet(){
        HashSet<Integer> odd = new HashSet<>();
        odd.add(1);
        odd.add(3);

        HashSet<Integer> even = new HashSet<>();
        even.add(2);
        even.add(4);

        even.addAll(odd);
        System.out.println("Union of two HashSet is : " + even);
    }

    public static void intersectionOfHashSet(){
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(4);

        set2.retainAll(set1);

        System.out.println("Intersection of two HashSet is : " + set2);
    }
}
