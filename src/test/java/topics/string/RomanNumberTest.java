package topics.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import topics.arrays.BestStockTrade;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(0, ""),
                Arguments.of(1, "I"),
                Arguments.of(4, "IV"),
                Arguments.of(3, "III"),
                Arguments.of(6, "VI"),
                Arguments.of(1151, "MCLI"),
                Arguments.of(58, "LVIII"),
                Arguments.of(621, "DCXXI"),
                Arguments.of(914, "CMXIV"),
                Arguments.of(1994, "MCMXCIV")
        );
    }

    @ParameterizedTest(name = "Roman numbers expected = {0}")
    @MethodSource("argumentsStream")
    void transform(int expectedSum, String str) {
        int actualSum = RomanNumber.transform(str);
        Assertions.assertEquals(expectedSum, actualSum);
    }
}