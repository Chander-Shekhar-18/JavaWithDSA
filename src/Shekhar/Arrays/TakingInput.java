package Shekhar.Arrays;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at " + i + "th index : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++)
            System.out.println("Element at " + i + "th index is : " + arr[i]);
    }
}
