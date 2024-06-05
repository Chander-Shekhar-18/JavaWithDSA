package Shekhar.Recursion;

import java.util.Arrays;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;
        System.out.println(ArraySearch(arr, x));
    }

    static boolean ArraySearch(int[] arr, int x){
        if (arr.length == 0) return false;

        if (arr[0] == x)
            return true;

        return ArraySearch(Arrays.copyOfRange(arr, 1, arr.length), x);
    }
}
