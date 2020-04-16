package topics.bitManipulation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {

    private static Stream<Arguments> argumentsStream(){
        return Stream.of(
                Arguments.of(true, 1),
                Arguments.of(true, 2),
                Arguments.of(true, 8),
                Arguments.of(true, 1024),
                Arguments.of(false, 9),
                Arguments.of(false, 10),
                Arguments.of(false, 2099)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void isPowerOfTwoTrivial(boolean expected, int n) {
        assertEquals(expected, PowerOfTwo.isPowerOfTwoTrivial(n));
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void isPowerOfTwoTricky(boolean expected, int n) {
        assertEquals(expected, PowerOfTwo.isPowerOfTwoTricky(n));
    }
}