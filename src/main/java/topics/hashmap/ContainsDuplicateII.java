package topics.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static boolean hashMapSolution(int[] nums, int k) {
        if (nums.length == 0) return false;

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                for (Integer num : map.get(nums[i])) {
                    if (Math.abs(num - i) <= k) return true;
                }
                map.get(nums[i]).add(i);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
        }
        return false;
    }

    public static boolean additionalArraySolution(int[] nums, int k) {
        if (nums.length == 0) return false;
        int[] clone = nums.clone();
        Arrays.sort(clone);

        for (int i = 0, currentPosition = -1; i < clone.length - 1; i++) {
            if (clone[i] == clone[i + 1]) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == clone[i]) {
                        if (currentPosition == -1) {
                            currentPosition = j;
                        } else {
                            if (j - currentPosition <= k) {
                                return true;
                            }
                            currentPosition = j;
                        }
                    }
                }
                currentPosition = -1;
            }
        }
        return false;
    }
}
