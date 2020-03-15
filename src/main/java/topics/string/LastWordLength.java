package topics.string;

public class LastWordLength {
    public static int calcLastWordLength(String s) {
        if (s.isEmpty()) return 0;
        s = s.trim();
        for (int i = s.length(); i > 0; i--) {
            if (s.charAt(i-1) == ' ') return s.length() - i;
        }
        return s.length();
    }
}
