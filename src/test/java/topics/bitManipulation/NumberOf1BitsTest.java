package topics.bitManipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class NumberOf1BitsTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(31, 0b11111111111111111111111111111101),
                Arguments.of(3, 0b00000000000000000000000000001011),
                Arguments.of(1, 0b00000000000000000000000010000000)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void hammingWeightTest(int expected, int n) {
        Assertions.assertEquals(expected, NumberOf1Bits.hammingWeight(n));
    }
}