package topics.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class WordPatternTest {

    private static Stream<Arguments> argumentsStream(){
        return Stream.of(
                Arguments.of(true, "abba", "mom dad dad mom"),
                Arguments.of(true, "abbab", "mom dad dad mom dad"),
                Arguments.of(true, "abbaa", "mom dad dad mom mom"),
                Arguments.of(true, "ababa", "mom dad mom dad mom"),
                Arguments.of(false, "abaa", "mom dad mom dad"),
                Arguments.of(false, "aaaa", "mom dad dad mom"),
                Arguments.of(false, "abba", "mom mom mom mom"),
                Arguments.of(false, "abab", "mom dad mom dad mom"),
                Arguments.of(false, "ababa", "mom dad mom dad")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void testName(boolean expected, String pattern, String word) {
        Assertions.assertEquals(expected, WordPattern.mapSolution(pattern, word));
    }
}