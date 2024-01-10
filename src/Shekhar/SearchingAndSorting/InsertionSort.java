package Shekhar.SearchingAndSorting;

import java.util.Arrays;

public class InsertionSort {
    //TODO : do this by Kunal Kushwaha
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        System.out.println("Array before sorting : " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Array after sorting : " + Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        int size = arr.length;

        for (int i = 1; i < size; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}