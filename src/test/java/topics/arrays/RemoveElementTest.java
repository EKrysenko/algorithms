package topics.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class RemoveElementTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 7, new int[]{2, 11, 15}, 3),
                Arguments.of(new int[]{2, 15, 15, 7, 8, 16, 16, 15}, 15, new int[]{2, 7, 8, 16, 16}, 5),
                Arguments.of(new int[]{1, 0, 0, 1, 1, 2, 3, 3, 1}, 1, new int[]{0, 0, 2, 3, 3}, 5),
                Arguments.of(new int[]{-1, -1, 11, 15, -1, -1, 0}, -1, new int[]{11, 15, 0}, 3)
        );
    }

    @ParameterizedTest(name = "Remove element brut force case {index}, target = {1}")
    @MethodSource("argumentsStream")
    void removeElementBrutForce(int[] nums, int val, int[] expectedArray, int expectedLength) {
        int actualLength = RemoveElement.removeElementBrutForce(nums, val);
        Assertions.assertEquals(expectedLength, actualLength);
        for (int i = 0; i < expectedLength; i++) {
            Assertions.assertEquals(expectedArray[i], nums[i]);
        }
    }
}