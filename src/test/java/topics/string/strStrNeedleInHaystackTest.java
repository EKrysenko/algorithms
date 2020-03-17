package topics.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class strStrNeedleInHaystackTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(0, "a", ""),
                Arguments.of(1, "ab", "b"),
                Arguments.of(2, "hello", "ll"),
                Arguments.of(-1, "ab", "c"),
                Arguments.of(-1, "aaaaa", "bba")
        );
    }

    @ParameterizedTest(name = "NeedleInHaystack approach, expected {0}")
    @MethodSource("argumentsStream")
    void strStr(int expected, String haystack, String needle) {
        int actual = StrStrNeedleInHaystack.strStr(haystack, needle);
        Assertions.assertEquals(expected, actual);
    }
}