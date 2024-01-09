package Shekhar.Arrays;

import java.util.Arrays;

public class SwapAlternate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        swapAlternate(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void swapAlternate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
