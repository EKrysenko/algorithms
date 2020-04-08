package topics.bitManipulation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerOfFourTest {

    private static Stream<Arguments> argumentsStream(){
        return Stream.of(
                Arguments.of(true, 1),
                Arguments.of(true, 4),
                Arguments.of(true, 16),
                Arguments.of(true, 64),
                Arguments.of(false, 0),
                Arguments.of(false, -1),
                Arguments.of(false, -16),
                Arguments.of(false, 9),
                Arguments.of(false, 10),
                Arguments.of(false, 2099)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void isPowerOfFour(boolean expected, int n) {
        assertEquals(expected, PowerOfFour.isPowerOfFour(n));
    }

}