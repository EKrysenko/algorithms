package topics.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CountPrimeTest {
    private static Stream<Arguments> argumentsStream(){
            return Stream.of(
                    Arguments.of(41537, 499979),
                    Arguments.of(168, 1000),
                    Arguments.of(25, 100),
                    Arguments.of(4, 10),
                    Arguments.of(1, 3),
                    Arguments.of(0, 2),
                    Arguments.of(0, 1),
                    Arguments.of(0, 0)
            );
        }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void countTest(int expected, int n) {
        Assertions.assertEquals(expected, CountPrime.count(n));
    }
}