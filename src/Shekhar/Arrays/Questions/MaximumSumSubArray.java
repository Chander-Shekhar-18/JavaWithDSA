package Shekhar.Arrays.Questions;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] arr){
        int maxTillNow = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            maxTillNow = Math.max(arr[i], maxTillNow + arr[i]);
//            System.out.println(maxTillNow);
            max = Math.max(max, maxTillNow);
        }

        return max;
    }
}
