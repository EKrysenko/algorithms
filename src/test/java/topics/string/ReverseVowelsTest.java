package topics.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ReverseVowelsTest {

    private static Stream<Arguments> argumentsStream(){
        return Stream.of(
                Arguments.of("ae", "ea"),
                Arguments.of("ace", "eca"),
                Arguments.of("ae ", "ea "),
                Arguments.of("cae ", "cea "),
                Arguments.of("HellO, world", "HollO, werld")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void reverseVowels(String s, String expected) {
        String actual = ReverseVowels.reverseVowels(s);
        Assertions.assertEquals(expected, actual);
    }
}