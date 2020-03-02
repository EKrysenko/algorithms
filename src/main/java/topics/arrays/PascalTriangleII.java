package topics.arrays;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalTriangleII {
    public static List<Integer> generateRow(int rowIndex) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        List<Integer> list2 = new ArrayList<>();

        if (rowIndex == 0) return Collections.singletonList(1);
        if (rowIndex == 1) return Arrays.asList(1, 1);

        for (int i = 1; i <= rowIndex; i++) {
            list1.clear();
            list1.add(1);
            for (int j = 1; j < list2.size(); j++) {
                list1.add(list2.get(j-1) + list2.get(j));
            }
            list1.add(1);
            List<Integer> tmp = list1;
            list1 = list2;
            list2 = tmp;
        }

        return list2;
    }
}
