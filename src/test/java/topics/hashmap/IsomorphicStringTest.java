package topics.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class IsomorphicStringTest {

    private static Stream<Arguments> argumentsStream(){
            return Stream.of(
                    Arguments.of(false, "adadau", "zczczc"),
                    Arguments.of(false, "adadad", "zczczz"),
                    Arguments.of(false, "aaaa", "aasa"),
                    Arguments.of(true, "adadad", "zczczc"),
                    Arguments.of(true, "asasa", "azaza"),
                    Arguments.of(true, "abcd", "xyzg"),
                    Arguments.of(true, "abcd", "xyzg")
            );
        }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void isIsomorphic(boolean expected, String s, String t) {
        Assertions.assertEquals(expected, IsomorphicString.isIsomorphic(s, t));
    }
}