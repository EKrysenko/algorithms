package topics.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generateTriangle(int numRows) {
        if (numRows < 1) {
            return Collections.emptyList();
        }
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(0, Collections.singletonList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = outer.get(i - 1);
            List<Integer> curr = new ArrayList<>();

            curr.add(0, 1);
            for (int j = 1; j < i; j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }
            curr.add(1);
            outer.add(curr);
        }
        return outer;
    }
}
