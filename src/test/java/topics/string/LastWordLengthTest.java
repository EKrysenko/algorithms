package topics.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LastWordLengthTest {

    private static Stream<Arguments> argumentsStream(){
        return Stream.of(
          Arguments.of(3, "abc"),
          Arguments.of(3, " abc"),
          Arguments.of(3, "abc "),
          Arguments.of(0, " "),
          Arguments.of(3, "a abc"),
          Arguments.of(1, "abc a"),
          Arguments.of(1, "abc a "),
          Arguments.of(0, "  "),
          Arguments.of(0, "")
        );
    }
    @ParameterizedTest
    @MethodSource("argumentsStream")
    void calcLastWordLength(int expected, String s) {
        final int actual = LastWordLength.calcLastWordLength(s);
        Assertions.assertEquals(expected, actual);
    }
}