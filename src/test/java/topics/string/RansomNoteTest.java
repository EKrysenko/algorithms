package topics.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class RansomNoteTest {

    private static Stream<Arguments> argumentsStream(){
        return Stream.of(
                Arguments.of(false, "aaxza", "aa"),
                Arguments.of(false, "aaxza", "zdabaa"),
                Arguments.of(false, "aa", "ab"),
                Arguments.of(true, "aaza", "zdabaa"),
                Arguments.of(true, "aaa", "abaa"),
                Arguments.of(true, "ba", "ab"),
                Arguments.of(true, "a", "aa"),
                Arguments.of(true, "", "")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void canConstruct(boolean expected, String ransomNote, String magazine) {
        boolean actual = RansomNote.canConstruct(ransomNote, magazine);
        Assertions.assertEquals(expected, actual);
    }
}