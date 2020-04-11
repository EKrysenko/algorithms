package topics.bitManipulation;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
    public static List<String> calculatePossibleTimes(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount((i << 6) + j) == n) {
                    result.add(String.format("%d:%02d", i, j));
                }
            }
        }

        return result;
    }
}
