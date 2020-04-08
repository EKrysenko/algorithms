package topics.bitManipulation;

public class MissingNumber {
    public static int findMissing(int[] nums) {
        int missing = nums.length;

        for (int i = 0; i < nums.length; i++) {
            missing ^= nums[i] ^ i;
        }

        return missing;
    }
}
