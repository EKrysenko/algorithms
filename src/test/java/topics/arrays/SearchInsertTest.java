package topics.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SearchInsertTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4, 3), //case middle
                Arguments.of(new int[]{-1, 2, 7, 8, 15, 16, 17, 18}, -1, 0), // case left
                Arguments.of(new int[]{-1, 2, 7, 8, 15, 16, 17, 18}, 18, 7), // case right
                Arguments.of(new int[]{-1, 2, 7, 8, 15, 16, 17, 18}, 3, 2) //
        );
    }

    @ParameterizedTest(name = "SearchInsert case {index}, target = {1}")
    @MethodSource("argumentsStream")
    void searchInsert(int[] nums, int target, int expected) {
        int actual = SearchInsert.searchInsert(nums, target);
        Assertions.assertEquals(expected, actual);
    }
}