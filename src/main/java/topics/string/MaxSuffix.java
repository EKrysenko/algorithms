package topics.string;

public class MaxSuffix {
    public static String findSuffixHorizontalScan(String[] strs){
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
}
