package SearchingAndSorting;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Linear search by static values
//        int[] arr = {10, 11, 2, 22};
//        int target = 22;
//        System.out.println(target + " found at index : " + linearSearch(arr,target));

//        Linear search by dynamic values
        int[] arr = takingInput();
        System.out.print("Enter the element for searching in the array : ");
        int targetElement = sc.nextInt();
        System.out.println(targetElement + " found at index " + linearSearch(arr, targetElement));
    }

    private static int[] takingInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + " element : ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
