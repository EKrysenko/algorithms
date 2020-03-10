package topics.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class PlusOneTest {


    @ParameterizedTest(name = "Plus one case {index}")
    @MethodSource("argumentsStream")
    void plusOne(int[] nums, int[] expected) {
        int[] actual = PlusOne.plusOne(nums);
        Assertions.assertArrayEquals(expected, actual);
    }
}