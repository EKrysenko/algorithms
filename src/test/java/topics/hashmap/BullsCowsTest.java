package topics.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class BullsCowsTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of("3A0B", "1000", "1200"),
                Arguments.of("1A1B", "1234", "1305"),
                Arguments.of("2A2B", "1204", "1402"),
                Arguments.of("3A0B", "1122", "1222"),
                Arguments.of("1A1B", "1123", "0111"),
                Arguments.of("1A3B", "1807", "7810")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void listSolutionTest(String expected, String secret, String guess) {
        Assertions.assertEquals(expected, BullsCows.listSolution(secret, guess));
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void arraySolutionTest(String expected, String secret, String guess) {
        Assertions.assertEquals(expected, BullsCows.arraySolution(secret, guess));
    }
}