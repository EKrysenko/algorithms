package topics.bitManipulation;

public class FindDifference {
    public static char findDifference(String s, String t) {
        char result = 0;

        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);
            result ^= t.charAt(i);
        }
        result ^= t.charAt(t.length() - 1);

        return result;
    }
}
