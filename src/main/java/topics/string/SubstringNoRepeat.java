package topics.string;

public class SubstringNoRepeat {

    public static int findLongest(String s) {
        if (s.length() < 2) return s.length();
        int res = 0, start = 0, end = 1;

        while (end < s.length()) {

            String substring = s.substring(start, end);
            char curr = s.charAt(end);
            if (!(substring.contains(s.charAt(end)+""))) {
                ++end;
            } else {
                start += substring.indexOf(curr) + 1;
                ++end;
            }
            res = Math.max(res, end - start);
        }

        return res;
    }
}
