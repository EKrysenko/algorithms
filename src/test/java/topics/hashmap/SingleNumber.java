package topics.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SingleNumber {

    public static int brutForce(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.computeIfPresent(num, (k, v) -> ++v);
            map.putIfAbsent(num, 1);
        }

        return map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .get(0);
    }

    /**
     * Based on XOR, where for int
     * A^0   == A,
     * A^A   == 0,
     * A^B^A == B
     * <p>If there's no A-duplicates, final sum will be A</p>
     */
    public static int xorSolution(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum = sum ^ num;
        }
        return sum;
    }
}
