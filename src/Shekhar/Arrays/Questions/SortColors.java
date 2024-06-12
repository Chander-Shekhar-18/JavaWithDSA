package Shekhar.Arrays.Questions;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int idx = 0;

        while (idx <= end && start < end) {
            if (nums[idx] == 0){
                nums[idx] = nums[start];
                nums[start] = 0;
                start++;
                idx++;
            } else if(nums[idx] == 2){
                nums[idx] = nums[end];
                nums[end] = 2;
                end--;
            }else {
                idx++;
            }
        }
    }
}
