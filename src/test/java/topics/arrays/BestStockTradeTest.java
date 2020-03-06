package topics.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class BestStockTradeTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(1, new int[]{1, 2}),
                Arguments.of(5, new int[]{7,1,5,3,6,4}),
                Arguments.of(0, new int[]{7, 6, 5, 4, 3})
        );
    }

    @ParameterizedTest(name = "Best stock trade brut force case {index}, target = {0}")
    @MethodSource("argumentsStream")
    void calcProfitBrutForce(int expected, int[] prices) {
        int actual = BestStockTrade.calcProfitBrutForce(prices);
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest(name = "Best stock trade one pass case {index}, target = {0}")
    @MethodSource("argumentsStream")
    void calcProfitOnePass(int expected, int[] prices) {
        int actual = BestStockTrade.calcProfitOnePass(prices);
        Assertions.assertEquals(expected,actual);
    }
}