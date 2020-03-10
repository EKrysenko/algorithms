package topics.string;

public class MaxPrefix {
    public static String findPrefixHorizontalScan(String[] strs) {
        if (strs.length == 0) return "";
        String suffix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;

            while (j < suffix.length()) {
                if (strs[i].isEmpty()) return "";

                if (strs[i].charAt(j) != suffix.charAt(j)) {
                    suffix = suffix.substring(0, j);
                    break;
                }
                ++j;
                if (j >= strs[i].length()) {
                    suffix = strs[i];
                    break;
                }
            }
        }
        return suffix;
    }

    public static String findPrefixVerticalScan(String[] strs) {
        if (strs.length == 0) return "";
        String suffix = strs[0];

        for (int i = 0; i < suffix.length(); i++) {
            for (String str : strs) {
                if (str.length() < i + 1 || !str.startsWith(suffix.substring(0, i + 1))) {
                    return suffix.substring(0, i);
                }
            }
        }
        return suffix;
    }
}
