package Shekhar.SearchingAndSorting.Questions;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {78, 9, 8},
                {45, 6, 9, 7},
                {95, 56, 68, 99}
        };
        System.out.println(Arrays.toString(search2D(arr, 7)));
    }

    static int[] search2D(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target)
                    return new int[]{i, j};
            }
        }

        return new int[]{-1, -1};
    }
}
