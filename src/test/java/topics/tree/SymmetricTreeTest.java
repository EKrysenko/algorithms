package topics.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SymmetricTreeTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(true, null),
                Arguments.of(true, new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(3), new TreeNode(4)),
                        new TreeNode(2,
                                new TreeNode(4), new TreeNode(3)))),
                Arguments.of(true, new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(3), null),
                        new TreeNode(2,
                                null, new TreeNode(3)))),
                Arguments.of(false, new TreeNode(1,
                        new TreeNode(2,
                                null, new TreeNode(3)),
                        new TreeNode(2,
                                null, new TreeNode(3)))),
                Arguments.of(false, new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(4), new TreeNode(3)),
                        new TreeNode(2,
                                new TreeNode(4), new TreeNode(3))))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void isSymmetricTest(boolean expected, TreeNode root) {
        Assertions.assertEquals(expected, SymmetricTree.isSymmetric(root));
    }
}