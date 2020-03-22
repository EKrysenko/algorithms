package topics.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ValidAnagramTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(true, " ", " "),
                Arguments.of(true, "", ""),
                Arguments.of(true, "abcd", "badc"),
                Arguments.of(true, "mama papa", "papa mama"),
                Arguments.of(true, "dose pro", "rose dop"),
                Arguments.of(false, "abcd", "aadc"),
                Arguments.of(false, "aacd", "badc"),
                Arguments.of(false, "abcd", "bac"),
                Arguments.of(false, "abcd", "badca")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void isValid(boolean expected, String s, String t) {
        Assertions.assertEquals(expected, ValidAnagram.isValid(s, t));
    }
}