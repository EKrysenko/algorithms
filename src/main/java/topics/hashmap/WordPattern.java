package topics.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {
    public static boolean mapSolution(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        char[] chars = pattern.toCharArray();
        String[] words = str.split(" ");

        if (chars.length != words.length) return false;

        for (int i = 0; i < chars.length; i++) {
            String currentWord = words[i];
            char currentChar = chars[i];

            if (!map.containsKey(currentChar)) {
                if (set.contains(currentWord)) {
                    return false;
                } else {
                    map.put(currentChar, currentWord);
                    set.add(currentWord);
                }

            } else if (!currentWord.equals(map.get(currentChar))) {
                return false;
            }
        }
        return true;
    }
}
