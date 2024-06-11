package Shekhar.Arrays.Questions;
import java.util.HashSet;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums){
            set.add(i);
        }

        return set.size() != nums.length;
    }
}
