package topics.bitManipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ConverterToHexadecimalTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of("a", 10),
                Arguments.of("1a", 26),
                Arguments.of("ffffffff", -1)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void testName(String expected, int num) {
        Assertions.assertEquals(expected, ConverterToHexadecimal.convert(num));
    }
}