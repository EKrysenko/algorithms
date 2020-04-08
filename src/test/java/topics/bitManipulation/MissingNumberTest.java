package topics.bitManipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MissingNumberTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(1, new int[]{0, 2, 3, 4, 5, 6, 7}),
                Arguments.of(2, new int[]{0, 1, 3, 4, 5, 6, 7}),
                Arguments.of(3, new int[]{0, 1, 2, 4, 5, 6, 7}),
                Arguments.of(8, new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}),
                Arguments.of(8, new int[]{0, 1, 2, 3, 4, 5, 6, 7})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void findMissingNumTest(int expected, int[] nums) {
        Assertions.assertEquals(expected, MissingNumber.findMissing(nums));
    }
}