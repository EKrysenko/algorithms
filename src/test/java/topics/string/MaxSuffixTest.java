package topics.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MaxSuffixTest {

    private static Stream<Arguments> argumentsStream(){
        return Stream.of(
                Arguments.of("", new String[]{}),
                Arguments.of("fl", new String[]{"flower","flow","flight"}),
                Arguments.of("", new String[]{"flower","flow",""}),
                Arguments.of("", new String[]{"","flow","fkfk"}),
                Arguments.of("", new String[]{"flower","flow","k"}),
                Arguments.of("f", new String[]{"frower","flow","flight"})
        );
    }
    @ParameterizedTest
    @MethodSource("argumentsStream")
    void findSuffixBF(String expected, String[] strs) {
        String actual = MaxSuffix.findSuffixHorizontalScan(strs);
        Assertions.assertEquals(expected, actual);
    }
}