package Shekhar.Recursion;

import java.util.Arrays;

public class FindFirstIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;
        System.out.println(findIdx(arr, x));
    }

    static int findIdx(int[] arr, int x) {
        if (arr.length == 0) return -1;

        if (arr[0] == x)
            return 0;

        int idx = findIdx(Arrays.copyOfRange(arr, 1, arr.length), x);

        if (idx != -1)
            return idx + 1;
        else
            return -1;
    }
}
