package topics.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SubstringNoRepeatTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(0, ""),
                Arguments.of(1, "a"),
                Arguments.of(2, "av"),
                Arguments.of(1, "aa"),
                Arguments.of(2, "aab"),
                Arguments.of(3, "dvdf"),
                Arguments.of(3, "abcabccd"),
                Arguments.of(3, "pwwkew"),
                Arguments.of(4, "abcdabcbb")
        );
    }

    @ParameterizedTest(name = "SubstringNoRepeat set approach, expected {0}")
    @MethodSource("argumentsStream")
    void findLongest(int expected, String s) {
        int actual = SubstringNoRepeat.findLongest(s);

        Assertions.assertEquals(expected, actual);
    }
}
