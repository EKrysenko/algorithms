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
                        new SameTree.TreeNode(2, null, new SameTree.TreeNode(3)),
                        new SameTree.TreeNode(2, null, new SameTree.TreeNode(3))),
                Arguments.of(false,
                        new SameTree.TreeNode(2, null, new SameTree.TreeNode(3)),
                        new SameTree.TreeNode(2, new SameTree.TreeNode(3), null)),
                Arguments.of(false,
                        new SameTree.TreeNode(2, null, new SameTree.TreeNode(3)),
                        new SameTree.TreeNode(2, null, new SameTree.TreeNode(4))),
                Arguments.of(false,
                        new SameTree.TreeNode(2, null, new SameTree.TreeNode(4)),
                        new SameTree.TreeNode(2, new SameTree.TreeNode(3), new SameTree.TreeNode(4)))

        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void isSameTest(boolean expected, SameTree.TreeNode p, SameTree.TreeNode q) {
        Assertions.assertEquals(expected, SameTree.isSame(p, q));
    }
}