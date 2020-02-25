package topics.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TwoSumTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{2, 7, 0, 15}, 15, new int[]{2, 3}),
                Arguments.of(new int[]{7, -1, 11, 15}, 14, new int[]{1, 3})
        );
    }

    @ParameterizedTest(name = "Map pre-check case {index}, target = {1}")
    @MethodSource("argumentsStream")
    void twoSumMapPreCheck(int[] nums, int target, int[] expected) {
        int[] actual = TwoSum.twoSumMapPreCheck(nums, target);
        Assertions.assertArrayEquals(expected, actual);
    }

    @ParameterizedTest(name = "Map case {index}, target = {1}")
    @MethodSource("argumentsStream")
    void twoSumMap(int[] nums, int target, int[] expected) {
        int[] actual = TwoSum.twoSumMap(nums, target);
        Assertions.assertArrayEquals(expected, actual);
    }

    @ParameterizedTest(name = "BrutForce case {index}, target = {1}")
    @MethodSource("argumentsStream")
    void twoSumBrutForce(int[] nums, int target, int[] expected) {
        int[] actual = TwoSum.twoSumBrutForce(nums, target);
        Assertions.assertArrayEquals(expected, actual);
    }

}