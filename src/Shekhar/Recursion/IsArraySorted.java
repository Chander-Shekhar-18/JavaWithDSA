package Shekhar.Recursion;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 40, 5};
        System.out.println(isSorted(nums, nums.length));
    }

    static boolean isSorted(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        if (arr[n - 2] > arr[n - 1])
            return false;

        boolean a = isSorted(arr, n - 1);

        return a;
    }
}
