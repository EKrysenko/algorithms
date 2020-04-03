package topics.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class InvertBTTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(
                        null,
                        null),


                Arguments.of(
                        new TreeNode(1),
                        new TreeNode(1)),

                Arguments.of(
                        new TreeNode(1,
                                new TreeNode(2,
                                        new TreeNode(3), null),
                                new TreeNode(4,
                                        new TreeNode(5), new TreeNode(6))),

                        new TreeNode(1,
                                new TreeNode(4,
                                        new TreeNode(6), new TreeNode(5)),
                                new TreeNode(2,
                                        null, new TreeNode(3)))),

                Arguments.of(
                        new TreeNode(1,
                                null,
                                new TreeNode(2)),
                        new TreeNode(1,
                                new TreeNode(2),
                                null)),

                Arguments.of(
                        new TreeNode(1,
                                new TreeNode(2,
                                        new TreeNode(3), new TreeNode(4)),
                                new TreeNode(5,
                                        new TreeNode(6), null)),
                        new TreeNode(1,
                                new TreeNode(5,
                                        null, new TreeNode(6)),
                                new TreeNode(2,
                                        new TreeNode(4), new TreeNode(3)))),

                Arguments.of(
                        new TreeNode(3,
                                new TreeNode(9, null, null),
                                new TreeNode(20,
                                        new TreeNode(15),
                                        new TreeNode(7))),
                        new TreeNode(3,
                                new TreeNode(20,
                                        new TreeNode(7),
                                        new TreeNode(15)),
                                new TreeNode(9, null, null))
                ));
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void invertTreeTest(TreeNode expected, TreeNode given) {
        Assertions.assertEquals(expected, InvertBT.invert(given));
    }
}