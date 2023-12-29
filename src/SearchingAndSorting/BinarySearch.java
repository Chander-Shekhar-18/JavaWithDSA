package SearchingAndSorting;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 3;
        System.out.println(target + " is found at index : " + binarySearch(arr, target));
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int midElement = start + (end - start) / 2;

            if (target < arr[midElement])
                end = midElement - 1;
            else if (target > arr[midElement])
                start = midElement + 1;
            else
                return midElement;
        }
        return -1;
    }
}
