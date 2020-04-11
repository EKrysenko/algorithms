package topics.bitManipulation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindDifferenceTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of('a', "", "a"),
                Arguments.of('c', "asdf", "asdfc"),
                Arguments.of('a', "aaabb", "aaaabb"),
                Arguments.of('b', "asdf", "absdf"),
                Arguments.of('q', "werty", "qweryt"),
                Arguments.of('p', "fkgj", "fpgkj")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void findDifferenceTest(char expected, String s, String t) {
        assertEquals(expected, FindDifference.findDifference(s, t));
    }
}