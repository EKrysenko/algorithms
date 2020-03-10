package topics.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class PlusOneTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 4}),
                Arguments.of(new int[]{1, 2, 9}, new int[]{1, 3, 0}),
                Arguments.of(new int[]{1, 9, 9}, new int[]{2, 0, 0}),
                Arguments.of(new int[]{9, 9, 9}, new int[]{1, 0, 0, 0})
        );
    }

    @ParameterizedTest(name = "Plus one case {index}")
    @MethodSource("argumentsStream")
    void plusOne(int[] nums, int[] expected) {
        int[] actual = PlusOne.plusOne(nums);
        Assertions.assertArrayEquals(expected, actual);
    }
}