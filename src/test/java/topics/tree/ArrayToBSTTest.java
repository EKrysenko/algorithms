package topics.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayToBSTTest {
    private static int[] given = new int[]{-10, -3, 0, 5, 9};
    private static TreeNode expected;

    static {
        expected =
                new TreeNode(0,
                        new TreeNode(-3,
                                new TreeNode(-10),
                                null),
                        new TreeNode(9,
                                new TreeNode(5),
                                null));
    }

    @Test
    void recursiveSolutionTest() {
        assertEquals(expected, ArrayToBST.recursiveSolution(given));
    }
}