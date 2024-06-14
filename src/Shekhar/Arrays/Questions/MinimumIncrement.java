package Shekhar.Arrays.Questions;

import java.util.Arrays;

public class MinimumIncrement {
    public static void main(String[] args) {
        int[] arr = {3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(arr));
    }

    public static int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int moves = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i -1]){
                int incr = nums[i - 1] - nums[i] + 1;
                nums[i] += incr;
                moves += incr;
            }
        }

        return moves;
    }
}
