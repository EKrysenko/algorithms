package topics.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ContainsDuplicateIITest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(false, new int[]{1, 2, 3, 4, 5, 1}, 4),
                Arguments.of(false, new int[]{1, 2, 3, 4, 5, 6}, 5),
                Arguments.of(false, new int[]{1, 2, 3, 1, 2, 3}, 2),
                Arguments.of(true, new int[]{1, 2, 3, 4, 1, 1}, 2),
                Arguments.of(true, new int[]{99, 99}, 2),
                Arguments.of(true, new int[]{2, 2}, 3),
                Arguments.of(true, new int[]{1, 2, 3, 4, 5, 1}, 5),
                Arguments.of(true, new int[]{1, 2, 3, 4, 1, 1}, 4),
                Arguments.of(true, new int[]{1, 2, 3, 1, 5, 1}, 3),
                Arguments.of(true, new int[]{1, 2, 1, 4, 5, 1}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void hashMapTest(boolean expected, int[] nums, int k) {
        boolean actual = ContainsDuplicateII.hashMapSolution(nums, k);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void additionalArrayTest(boolean expected, int[] nums, int k) {
        boolean actual = ContainsDuplicateII.additionalArraySolution(nums, k);
        Assertions.assertEquals(expected, actual);
    }
}