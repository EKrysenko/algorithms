package topics.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MaxPrefixTest {

    private static Stream<Arguments> argumentsStream(){
        return Stream.of(
                Arguments.of("", new String[]{}),
                Arguments.of("fl", new String[]{"flower","flow","flight"}),
                Arguments.of("", new String[]{"flower","flow",""}),
                Arguments.of("", new String[]{"","flow","fkfk"}),
                Arguments.of("", new String[]{"flower","flow","k"}),
                Arguments.of("", new String[]{"c","acc","ccc"}),
                Arguments.of("f", new String[]{"frower","flow","flight"})
        );
    }
    @ParameterizedTest(name = "MaxSuffix horizontal scan, case {index}")
    @MethodSource("argumentsStream")
    void findSuffixHS(String expected, String[] strs) {
        String actual = MaxPrefix.findPrefixHorizontalScan(strs);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "MaxSuffix vertical scan, case {index}")
    @MethodSource("argumentsStream")
    void findSuffixVS(String expected, String[] strs) {
        String actual = MaxPrefix.findPrefixVerticalScan(strs);
        Assertions.assertEquals(expected, actual);
    }
}