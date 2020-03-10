package topics.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MaxSubArrayTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, -2, 3, 1}, 4),
                Arguments.of(new int[]{0, 1, -2, 3, -1}, 3),
                Arguments.of(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6),
                Arguments.of(new int[]{0, 0, 0, 2, 3}, 5)
        );
    }

    @ParameterizedTest(name = "Max sub array brut force case {index}, target = {1}")
    @MethodSource("argumentsStream")
    void maxSubArrayTest(int[] nums, int expectedSum) {
        int actualSum = MaxSubArray.maxSubArrayBrutForce(nums);
        Assertions.assertEquals(expectedSum, actualSum);
    }
}