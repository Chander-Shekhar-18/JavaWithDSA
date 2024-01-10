package Shekhar.SearchingAndSorting;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 8, 10, 13, 17};
        int[] arr2 = {2, 3, 5, 7, 9, 11, 12};
        System.out.println("Array 1 before sorting : " + Arrays.toString(arr1));
        System.out.println("Array 2 before sorting : " + Arrays.toString(arr2));
        int[] arr3 = mergeArray(arr1, arr2);
        System.out.println("Final array after sorting : " + Arrays.toString(arr3));
    }
    private static int[] mergeArray(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] arr3 = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]){
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < arr1.length) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        return arr3;
    }
}
