package Arrays;

import java.util.Arrays;

public class PrimitivesAndNonPrimitives {
    public static void main(String[] args) {
        // Primitive Data type example
        int n = 10;
        increment(n);
        System.out.println("Updated value of n is : " + n);

        // Non primitive data type
        int[] arr = {1, 2, 3, 4, 5, 6};
        arrayIncrement(arr);
        System.out.println("Updated value of array is : " + Arrays.toString(arr));
        System.out.println("The memory address of original array is : " + arr);
    }

    private static void increment(int n) {
        n++;
    }

    private static void arrayIncrement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
        System.out.println("The memory address of incremented array is : " + arr);
    }
}
