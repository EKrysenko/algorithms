package topics.hashmap;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainsDuplicateTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(true, new int[]{1, 2, 3, 4, 1, 2}),
                Arguments.of(true, new int[]{1, 2, 3, 4, 1}),
                Arguments.of(true, new int[]{1, 1}),
                Arguments.of(false, new int[]{1}),
                Arguments.of(false, new int[]{}),
                Arguments.of(false, new int[]{1, 2, 3, 4, 5, 6})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void containsDuplicate(boolean expected, int[] nums) {
        assertEquals(expected, ContainsDuplicate.containsDuplicate(nums));
    }
}