package topics.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class LowestCommonAncestorTest {

    private static Stream<Arguments> argumentsStream(){
        return Stream.of(
                Arguments.of(3, 5, 4),
                Arguments.of(2, 4, 2),
                Arguments.of(0, 9, 6),
                Arguments.of(5, 0, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void findLowestCommonAncestor(int p, int q, int expected) {
        TreeNode givenRoot =
                new TreeNode(6,
                        new TreeNode(2,
                                new TreeNode(0),
                                new TreeNode(4,
                                        new TreeNode(3),
                                        new TreeNode(5))),
                        new TreeNode(8,
                                new TreeNode(7),
                                new TreeNode(9))
                );
        TreeNode pNode = new TreeNode(p), qNode = new TreeNode(q);

        TreeNode actual = LowestCommonAncestor.findLowestCommonAncestor(givenRoot, pNode, qNode);

        Assertions.assertEquals(expected, actual.val);
    }
}