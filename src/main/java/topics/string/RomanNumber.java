package topics.string;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    public static int transform(String s) {
        int sum = 0, i = 0;

        int length = s.length();
        if (length == 0) return 0;

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        String[] digits = s.split("");

        while (i < length) {
            if (i == length - 1) {
                return sum + map.get(digits[i]);
            }
            if (map.get(digits[i]) >= map.get(digits[i + 1])) {
                sum += map.get(digits[i++]);
            } else {
                sum += map.get(digits[i + 1]) - map.get(digits[i]);
                i+=2;
            }
        }
        return sum;
    }
}
