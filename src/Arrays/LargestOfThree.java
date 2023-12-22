package Arrays;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        int[] arr = takingInput();
        printArray(arr);

        int max = largest(arr);
        System.out.println("The largest element is : " + max);
    }

    private static int[] takingInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element at " + i + "th index : ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > max)
                max = j;
        }

        return max;
    }
}
