package topics.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

class PascalTriangleTest {

    @Test
    void generateTriangleTest() {
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> list1 = singletonList(1);
        List<Integer> list2 = Arrays.asList(1, 1);
        List<Integer> list3 = Arrays.asList(1, 2, 1);
        List<Integer> list4 = Arrays.asList(1, 3, 3, 1);
        List<Integer> list5 = Arrays.asList(1, 4, 6, 4, 1);
        List<Integer> list6 = Arrays.asList(1, 5, 10, 10, 5, 1);
        expected.add(list1);
        expected.add(list2);
        expected.add(list3);
        expected.add(list4);
        expected.add(list5);
        expected.add(list6);

        List<List<Integer>> actual = PascalTriangle.generateTriangle(6);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void generateTestZero() {
        List<List<Integer>> actual = PascalTriangle.generateTriangle(0);
        Assertions.assertIterableEquals(emptyList(), actual);
    }

    @Test
    void generateTestOne() {
        List<List<Integer>> actual = PascalTriangle.generateTriangle(1);
        Assertions.assertIterableEquals(singletonList(singletonList(1)), actual);
    }
}