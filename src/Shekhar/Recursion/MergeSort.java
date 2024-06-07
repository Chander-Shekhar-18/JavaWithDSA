package Shekhar.Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (right > left) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            mergeArr(arr, left, mid, right);
        }
    }

    private static void mergeArr(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];


        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                i = i + 1;
            } else {
                arr[k] = rightArr[j];
                j = j + 1;
            }
            k = k + 1;
        }

        while (i < n1){
            arr[k] = leftArr[i];
            i = i + 1;
            k = k + 1;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j = j + 1;
            k = k + 1;
        }
    }
}
