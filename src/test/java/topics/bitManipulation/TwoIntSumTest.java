package topics.bitManipulation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoIntSumTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(3, 1, 2),
                Arguments.of(13, 11, 2),
                Arguments.of(103, 1, 102),
                Arguments.of(3, 1, 2),
                Arguments.of(20003, 10001, 10002)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void sumTest(int expected, int a, int b) {
        assertEquals(expected, TwoIntSum.sum(a, b));
    }
}