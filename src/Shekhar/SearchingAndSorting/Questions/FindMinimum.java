package Shekhar.SearchingAndSorting.Questions;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {89, 55, 74, 6, 78, 65, 11};
        System.out.println(minElement(arr));
    }
    static int minElement (int[] arr) {
        if (arr.length == 0)
            return -1;

        int ans = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < ans)
                ans = arr[i];
        }
        return ans;
    }
}
