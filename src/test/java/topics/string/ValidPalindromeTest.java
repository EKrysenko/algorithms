package topics.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    private static Stream<Arguments> argumentsStream(){
        return Stream.of(
          Arguments.of(true, ""),
          Arguments.of(true, " "),
          Arguments.of(true, "a"),
          Arguments.of(true, "aa"),
          Arguments.of(true, "aba"),
          Arguments.of(true, "a,ba"),
          Arguments.of(true, "ab,a"),
          Arguments.of(true, "ab a"),
          Arguments.of(true, "a bba"),
          Arguments.of(true, "A man, a plan, a canal: Panama"),
          Arguments.of(false, "az bba"),
          Arguments.of(false, "a bbac"),
          Arguments.of(false, "a bba v")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void isValid(boolean expected, String s) {
        final boolean actual = ValidPalindrome.isValid(s);
        Assertions.assertEquals(expected, actual);
    }
}