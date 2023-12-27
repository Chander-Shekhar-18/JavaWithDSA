package Arrays;

import java.util.Arrays;

public class SwapAlternate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(swapAlternate(arr)));
    }

    private static int[] swapAlternate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                arr[j] = arr[i];
                arr[i] = arr[j];
            }
        }
        return arr;
    }
}
