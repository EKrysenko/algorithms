package topics.hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) return false;
        if (nums.length < 1000) {
            return longArrayCheck(nums);
        }
        return shortArrayCheck(nums);
    }

    private static boolean shortArrayCheck(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

    private static boolean longArrayCheck(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}
