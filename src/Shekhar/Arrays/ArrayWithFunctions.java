package Shekhar.Arrays;

import java.util.Scanner;

public class ArrayWithFunctions {
    public static void main(String[] args) {
        int[] arr = takingInput();
        printArray(arr);
    }

    private static int[] takingInput () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element at " + i + " index : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static void printArray (int[] arr) {
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
