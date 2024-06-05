package Shekhar.Recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(ArraySum(arr,0));
    }

    static int ArraySum (int[] arr, int index) {
        if (index == arr.length - 1) return arr[index];

        int ans = arr[index] + ArraySum(arr, index + 1);

        return ans;
    }
}
