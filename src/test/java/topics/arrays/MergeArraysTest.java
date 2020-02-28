package topics.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MergeArraysTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 7, 0, 0, 0}, 4, new int[]{2, 3, 6}, 3, new int[]{1, 2, 3, 3, 5, 6, 7}),
                Arguments.of(new int[]{1, 2, 5, 7, 0, 0, 0}, 4, new int[]{2, 3, 6}, 3, new int[]{1, 2, 2, 3, 5, 6, 7}),
                Arguments.of(new int[]{0, 0, 1, 2, 0, 0, 0}, 4, new int[]{2, 3, 6}, 3, new int[]{0, 0, 1, 2, 2, 3, 6}),
                Arguments.of(new int[]{1, 2, 5, 7, 0, 0, 0}, 4, new int[]{2, 3, 6}, 3, new int[]{1, 2, 2, 3, 5, 6, 7}),
                Arguments.of(new int[]{2, 3, 5, 7, 0, 0}, 4, new int[]{-2, 8}, 2, new int[]{-2, 2, 3, 5, 7, 8}),
                Arguments.of(new int[]{1, 1, 3, 5, 6, 0, 0, 0, 0}, 5, new int[]{2, 4}, 2, new int[]{1, 1, 2, 3, 4, 5, 6, 0, 0}),
                Arguments.of(new int[]{4, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3, new int[]{1, 2, 3, 4, 5, 6})
        );
    }

    @ParameterizedTest(name = "Merge arrays case {index}")
    @MethodSource("argumentsStream")
    void mergeArrays(int[] nums1, int m, int[] nums2, int n, int[] expected) {
        MergeArrays.mergeArrays(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expected, nums1);
    }
}