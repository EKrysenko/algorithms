package topics.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SameTreeTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(true,
                        new TreeNode(2, null, new TreeNode(3)),
                        new TreeNode(2, null, new TreeNode(3))),
                Arguments.of(false,
                        new TreeNode(2, null, new TreeNode(3)),
                        new TreeNode(2, new TreeNode(3), null)),
                Arguments.of(false,
                        new TreeNode(2, null, new TreeNode(3)),
                        new TreeNode(2, null, new TreeNode(4))),
                Arguments.of(false,
                        new TreeNode(2, null, new TreeNode(4)),
                        new TreeNode(2, new TreeNode(3), new TreeNode(4)))

        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void isSameTest(boolean expected, TreeNode p, TreeNode q) {
        Assertions.assertEquals(expected, SameTree.isSame(p, q));
    }
}