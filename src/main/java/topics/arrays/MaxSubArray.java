package topics.arrays;

public class MaxSubArray {

    public static int maxSubArrayBrutForce(int[] nums) {
       int globalSum = nums[0];
       int localSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            localSum = Math.max(localSum + nums[i], nums[i]);
            globalSum = Math.max(globalSum, localSum);
        }
        return globalSum;
    }
}
