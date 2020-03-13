package topics.string;

public class CountAndSay {

    public static String brutForce(int n) {
        if (n == 0) return "";
        String result = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0, count = 1; j < result.length(); j++) {
                if (j == result.length() - 1) {
                    sb.append(count).append(result.charAt(j));
                    break;
                }
                if (result.charAt(j) == result.charAt(j + 1)) {
                    ++count;
                } else {
                    sb.append(count).append(result.charAt(j));
                    count = 1;
                }
            }

            result = sb.toString();
        }
        return result;
    }

    public static String recursive(int n) {
        if (n == 0) return "";
        if (n == 1) return "1";

        StringBuilder sb = new StringBuilder();

        String previous = brutForce(n - 1);
        int count = 1;

        for (int i = 0; i < previous.length(); i++) {
            if (i == previous.length() - 1) {
                sb.append(count).append(previous.charAt(i));
            } else if (previous.charAt(i) == previous.charAt(i + 1)) {
                count++;
            } else {
                sb.append(count).append(previous.charAt(i));
                count = 1;
            }
        }

        return sb.toString();
    }
}
