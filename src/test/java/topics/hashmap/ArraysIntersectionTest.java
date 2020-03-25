package topics.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ArraysIntersectionTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{2, 3}, new int[]{1, 2, 3, 4}, new int[]{7, 3, 2, 5}),
                Arguments.of(new int[]{-3, 10}, new int[]{5, 4, 10, -3}, new int[]{-3, 10, 8}),
                Arguments.of(new int[]{}, new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8}),
                Arguments.of(new int[]{}, new int[]{1, 1, 1}, new int[]{0, 0, 0}),
                Arguments.of(new int[]{1}, new int[]{1, 0, 0, 0}, new int[]{1, 1, 1, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void setSolutionTest(int[] expected, int[] nums1, int[] nums2) {
        Assertions.assertArrayEquals(expected, ArraysIntersection.setSolution(nums1, nums2));
    }
}