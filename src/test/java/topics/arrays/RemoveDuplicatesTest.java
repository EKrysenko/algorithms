package topics.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class RemoveDuplicatesTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, new int[]{2, 7, 11, 15}, 4),
                Arguments.of(new int[]{2, 7, 8, 15, 15, 16, 16}, new int[]{2, 7, 8, 15, 16}, 5),
                Arguments.of(new int[]{0, 0, 1, 1, 2, 3, 3, 4}, new int[]{0, 1, 2, 3, 4}, 5),
                Arguments.of(new int[]{-1, -1, 11, 15}, new int[]{-1, 11, 15}, 3)
        );
    }

    @ParameterizedTest(name = "Remove duplicates brut force case {index}, target = {1}")
    @MethodSource("argumentsStream")
    void removeDuplicatesBrutForce(int[] nums, int[] expectedArray, int expectedLength) {
        int actualLength = RemoveDuplicates.removeDuplicatesBrutForce(nums);
        Assertions.assertEquals(expectedLength, actualLength);
        for (int i = 0; i < expectedLength; i++) {
            Assertions.assertEquals(expectedArray[i], nums[i]);
        }
    }
}