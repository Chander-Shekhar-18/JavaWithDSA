package Shekhar.Arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        nextPermutation(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        while (i >= 0 && nums[i] > nums[i + 1]) {
            i--;
            System.out.println(i + " " + nums[i]);
        }

        if (i >= 0) {
            int j = nums.length - 1;

            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    public static void reverse(int[] arr, int i) {
        int end = arr.length - 1;
        while (i < end) {
            swap(arr, i, end);
            i++;
            end--;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
