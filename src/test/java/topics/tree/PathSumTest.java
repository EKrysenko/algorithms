package topics.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class PathSumTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(false, 0,
                        null),


                Arguments.of(true, 1,
                        new TreeNode(1)),

                Arguments.of(true, 7,
                        new TreeNode(1,
                                new TreeNode(2,
                                        new TreeNode(3), new TreeNode(4)),
                                new TreeNode(2,
                                        new TreeNode(4), null))),

                Arguments.of(false, 1,
                        new TreeNode(1,
                                new TreeNode(2),
                                null)),

                Arguments.of(false, 3,
                        new TreeNode(1,
                                new TreeNode(2,
                                        new TreeNode(3), new TreeNode(4)),
                                new TreeNode(5,
                                        new TreeNode(4), null))),

                Arguments.of(false, 2,
                        new TreeNode(3,
                                new TreeNode(9, null, null),
                                new TreeNode(20,
                                        new TreeNode(15),
                                        new TreeNode(7)))
                ));
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void hasSumTest(boolean expected, int sum, TreeNode root) {
        Assertions.assertEquals(expected, PathSum.hasPathSum(root, sum));
    }
}