package Shekhar.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7 ,8, 9};
        int x = 2;
        System.out.println(binarySearch(arr, x, 0, arr.length) - 1);
    }

    public static int binarySearch(int[] arr, int x, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x)
                return mid + 1;
            else if (arr[mid] > x)
                return binarySearch(arr, x, start, mid - 1);
            else
                return binarySearch(arr, x, mid + 1, end);
        } else
            return -1;
    }
}
