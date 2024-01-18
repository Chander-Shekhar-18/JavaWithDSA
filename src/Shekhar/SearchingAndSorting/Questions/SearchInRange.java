package Shekhar.SearchingAndSorting.Questions;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int start = 1;
        int end = 4;
        int target = 3;
        System.out.println(target + " is present in the array at index : " + rangeSearch(arr, start, end, target));
    }

    static int rangeSearch(int[] arr, int start, int end, int target) {
        if (arr.length == 0)
            return -1;

        for (int i = start; i < end; i++)
            if (arr[i] == target)
                return i;

        return -1;
    }
}
