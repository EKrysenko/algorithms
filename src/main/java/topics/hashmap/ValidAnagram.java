package topics.hashmap;

public class ValidAnagram {
    public static boolean isValid(String s, String t) {
        if (s.length() != t.length()) return false;
        if (s.isEmpty()) return true;

        int[] map = new int[123];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)] += 1;
            map[t.charAt(i)] -=1;
        }
        for (int curr : map) {
            if (curr != 0) return false;
        }
        return true;
    }
}
