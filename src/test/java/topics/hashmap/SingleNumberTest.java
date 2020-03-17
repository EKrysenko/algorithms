package topics.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SingleNumberTest {

    private static Stream<Arguments> argumentsStream(){
        return Stream.of(
                Arguments.of(2, new int[]{1, 2, 4, 5, 6, 6, 4, 5, 1}),
                Arguments.of(5, new int[]{1, 2, 4, 5, 6, 6, 4, 2, 1}),
                Arguments.of(4, new int[]{1, 2, 4, 5, 6, 6, 2, 5, 1}),
                Arguments.of(1, new int[]{1, 2, 4, 5, 6, 6, 4, 5, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void brutForceTest(int expected, int[] nums) {
        int actual = SingleNumber.brutForce(nums);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void xorTest(int expected, int[] nums) {
        int actual = SingleNumber.xorSolution(nums);
        Assertions.assertEquals(expected, actual);
    }
}