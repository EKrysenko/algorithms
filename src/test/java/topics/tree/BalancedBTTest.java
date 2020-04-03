package topics.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BalancedBTTest {

    @Test
    void isBalancedTrueTest() {
        TreeNode given =
                new TreeNode(0,
                        new TreeNode(-10,
                                null,
                                new TreeNode(-3)),
                        new TreeNode(5,
                                null,
                                new TreeNode(9)));

        Assertions.assertTrue(BalancedBT.isBalancedRecursive(given));
    }

    @Test
    void isBalancedFalseTest() {
        TreeNode given =
                new TreeNode(0,
                        new TreeNode(-10,
                                null,
                                new TreeNode(-3)),
                        new TreeNode(5,
                                null,
                                new TreeNode(9,
                                        new TreeNode(10,
                                                new TreeNode(0), null),
                                        null)));

        Assertions.assertFalse(BalancedBT.isBalancedRecursive(given));
    }
}