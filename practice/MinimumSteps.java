package practice;

public class MinimumSteps {
    public static void main(String[] args) {
        int count = 0;
        int[] nums = new int[] { 2, 3, 1, 1, 2, 4, 2, 0, 1, 1 };
        for (int i = 0; i < nums.length; i++) {
            i += nums[i];
            count++;
        }
        System.out.println(count);
    }
}
