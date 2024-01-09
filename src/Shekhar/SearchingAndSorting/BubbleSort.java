package Shekhar.SearchingAndSorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {12, 9, 4, 99, 120, 1, 3, 10};
        System.out.println("Array before sorting : " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Array after sorting : " + Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - 1 - i; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }
}
