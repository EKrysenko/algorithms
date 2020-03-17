package topics.string;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            map.computeIfPresent(c, (k, v) -> ++v);
            map.putIfAbsent(c, 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) <= 0) {
                return false;
            }
            map.compute(c, (k, v) -> --v);
        }
        return true;
    }
}
