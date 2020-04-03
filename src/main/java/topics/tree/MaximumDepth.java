package topics.tree;

public class MaximumDepth {
    public static int findMaxDepth(TreeNode root) {
        if (root == null) return 0;
        int depth = 1;
        depth += Math.max(findMaxDepth(root.left), findMaxDepth(root.right));
        return depth;
    }
}
