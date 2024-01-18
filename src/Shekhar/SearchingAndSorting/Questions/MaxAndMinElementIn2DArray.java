package Shekhar.SearchingAndSorting.Questions;

public class MaxAndMinElementIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {78, 900, 8},
                {45, 6, 9, 7},
                {95, 56, 68, 99}
        };
        System.out.println("Maximum element is the array is : " + maxElement(arr));
        System.out.println("Minimum element is the array is : " + minElement(arr));
    }

    static int maxElement(int[][] arr) {

        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++)
                if (arr[row][col] > max)
                    max = arr[row][col];

        return max;
    }

    static int minElement(int[][] arr) {

        int min = arr[0][0];
        for(int[] row : arr)
            for (int colValue : row)
                if (colValue < min)
                    min = colValue;

        return min;
    }
}