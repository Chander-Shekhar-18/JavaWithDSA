package Shekhar.Arrays;

public class MaximumElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6000, 7, 8, 9};
        System.out.println("Maximum Element is the array is : " + maximumElement(arr));
    }

    static int maximumElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }
}
