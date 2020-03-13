package topics.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CountAndSayTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(2, "11"),
                Arguments.of(3, "21"),
                Arguments.of(4, "1211"),
                Arguments.of(5, "111221"),
                Arguments.of(6, "312211")
        );
    }

    @ParameterizedTest(name = "Count and say, expected {1}")
    @MethodSource("argumentsStream")
    void brutForceTest(int n, String expected) {
        String actual = CountAndSay.brutForce(n);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Count and say recursive, expected {1}")
    @MethodSource("argumentsStream")
    void recursiveTest(int n, String expected) {
        String actual = CountAndSay.brutForce(n);
        Assertions.assertEquals(expected, actual);
    }
}