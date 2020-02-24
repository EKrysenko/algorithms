package topics.arrays;

public class TwoSum {

    public static int[] twoSumBrutForce(int[] nums, int target) {
        int[] result = new int[2];
        int delta;

        for (int i = 0; i < nums.length - 1; i++) {
            delta = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == delta) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        throw new RuntimeException("Incorrect input data. No sum founded");
    }
}
