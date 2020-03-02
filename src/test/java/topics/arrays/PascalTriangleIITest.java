package topics.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Collections.singletonList;

class PascalTriangleIITest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(0, singletonList(1)),
                Arguments.of(1, Arrays.asList(1, 1)),
                Arguments.of(2, Arrays.asList(1, 2, 1)),
                Arguments.of(3, Arrays.asList(1, 3, 3, 1)),
                Arguments.of(4, Arrays.asList(1, 4, 6, 4, 1)),
                Arguments.of(5, Arrays.asList(1, 5, 10, 10, 5, 1)),
                Arguments.of(6, Arrays.asList(1, 6, 15, 20, 15, 6, 1))
        );
    }

    @ParameterizedTest(name = "Pascal triangle II case {index}, target = {0}")
    @MethodSource("argumentsStream")
    void generateRowTest(int rowIndex, List<Integer> expected) {
        List<Integer> actual = PascalTriangleII.generateRow(rowIndex);
        Assertions.assertIterableEquals(expected, actual);
    }
}