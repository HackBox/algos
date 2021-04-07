package practice;
import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 4, 5, 7, 6, 1, 9, 10 };
        int duplicate = duplicate(nums);
        System.out.println(duplicate);
    }

    static int duplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) {
                return nums[i];
            } else {
                hashSet.add(nums[i]);
            }
        }
        return -1;
    }
}
