package Shekhar.Arrays;

public class PrintPairs {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 6, 5};
        printPairs(arr);
    }

    private static void printPairs (int[] arr) {
        //arr.length-1 because no pair possible from last element, we don't need to check for that
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("[" + arr[i] + " , " + arr[j] + "]");
            }
        }
    }
}
