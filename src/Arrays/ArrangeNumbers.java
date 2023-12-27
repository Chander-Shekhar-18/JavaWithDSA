package Arrays;

public class ArrangeNumbers {
    public static void main(String[] args) {
        int[] arr = {};
        arrange(arr, arr.length);
    }

    private static void arrange(int[] arr, int size) {
        int left = 0;
        int right = size - 1;
        int counter = 1;

        while (left <= right) {
            if (counter % 2 == 1) {
                arr[left] = counter;
                counter += 1;
                left += 1;
            } else {
                arr[right] = counter;
                counter += 1;
                right -= 1;
            }
        }
    }
}
