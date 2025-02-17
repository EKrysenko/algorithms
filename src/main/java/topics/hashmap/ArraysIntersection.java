package topics.hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysIntersection {
    public static int[] setSolution(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)){
                list.add(num);
                set.remove(num);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
