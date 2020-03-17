package topics.string;

public class StrStrNeedleInHaystack {

    public static int strStr(String haystack, String needle) {

        if (needle.isEmpty()) return 0;
        if (needle.length() > haystack.length()) return -1;

        int result = -1;
        char[] hayChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();

        for (int i = 0; i <= hayChars.length - needleChars.length; i++) {
            for (int j = 0; j < needleChars.length; j++) {
                if (needleChars[j] != hayChars[i + j]) {
                    break;
                }
                if (j == needleChars.length - 1 && needleChars[j] == hayChars[i + j]) {
                    return i;
                }
            }
        }

        return result;
    }
}
