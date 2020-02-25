package topics.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSumMapPreCheck(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        int delta;
        for (int i = 0; i < nums.length; i++) {
            delta = target - nums[i];
            if (map.containsKey(delta) && map.get(delta) != i) {
                result[0] = map.get(delta);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }


        throw new RuntimeException("Incorrect input data. No sum founded");
    }

    public static int[] twoSumMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        int delta;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {
            delta = target - nums[j];
            if (map.containsKey(delta) && map.get(delta) != j) {
                result[0] = j;
                result[1] = map.get(delta);
                return result;
            }
        }
        throw new RuntimeException("Incorrect input data. No sum founded");
    }

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
