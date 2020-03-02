package topics.arrays;

public class PlusOne {

    public static int[] plusOne(int[] nums) {
        for (int i = nums.length - 1; i >= 0; --i) {
            nums[i] += 1;
            if (nums[i] != 10) {
                break;
            }
            nums[i] = 0;
        }
        if (nums[0] == 0) {
            nums = new int[nums.length + 1];
            nums[0] = 1;
        }
        return nums;
    }
}
