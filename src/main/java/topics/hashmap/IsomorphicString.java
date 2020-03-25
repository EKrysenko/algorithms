package topics.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicString {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);
            if (map.containsKey(key) && map.get(key) != value){
                return false;
            }
            if (!map.containsKey(key) && set.contains(value)) {
                return false;
            }
            map.put(key, value);
            set.add(value);
        }
        return true;
    }
}
