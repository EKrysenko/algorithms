package topics.bitManipulation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementTest {
    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(1, new int[]{2, 2, 1, 1, 1, 2, 2}),
                Arguments.of(2, new int[]{1, 2, 3, 2, 4, 2, 2, 1, 2}),
                Arguments.of(3, new int[]{0, 0, 3, 3, 4, 3, 3, 4, 1, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void majorityElement(int expected, int[] nums) {
        int actual = MajorityElement.majorityElement(nums);

        assertEquals(expected, actual);
    }
}