package topics.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ParenthesesTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(true, "{}"),
                Arguments.of(true, ""),
                Arguments.of(true, "()"),
                Arguments.of(true, "[]"),
                Arguments.of(true, "(())"),
                Arguments.of(true, "([])"),
                Arguments.of(true, "(){}[]"),
                Arguments.of(true, "({[]})"),
                Arguments.of(false, "("),
                Arguments.of(false, "{"),
                Arguments.of(false, "["),
                Arguments.of(false, ")"),
                Arguments.of(false, "}"),
                Arguments.of(false, "]"),
                Arguments.of(false, "{]"),
                Arguments.of(false, "{]}"),
                Arguments.of(false, "{(]")
        );
    }

    @ParameterizedTest(name = "Parentheses validation expected = {0}")
    @MethodSource("argumentsStream")
    void validationTest(boolean expected, String s) {
        Assertions.assertEquals(expected, ParenthesesValidator.validate(s));
    }
}