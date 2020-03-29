package topics.tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class LevelOrderTraversalTest {
    private static List<List<Integer>> expected;
    private static TreeNode given;

    static {
        given =
                new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(3,
                                        new TreeNode(4),
                                        new TreeNode(4)),
                                new TreeNode(3,
                                        new TreeNode(4),
                                        null)),
                        new TreeNode(2,
                                new TreeNode(3,
                                        new TreeNode(4),
                                        new TreeNode(4)),
                                null));
        expected = new ArrayList<>();
        expected.add(Arrays.asList(4, 4, 4, 4, 4));
        expected.add(Arrays.asList(3, 3, 3));
        expected.add(Arrays.asList(2, 2));
        expected.add(Arrays.asList(1));
    }

    @Test
    void iterativeSolutionTest() {
        assertIterableEquals(expected, LevelOrderTraversal.iterativeSolution(given));
    }

    @Test
    void recursiveSolutionTest() {
        assertIterableEquals(expected, LevelOrderTraversal.recursiveSolution(given));
    }
}