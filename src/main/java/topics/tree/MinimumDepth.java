package topics.tree;

public class MinimumDepth {
    public static int findMinimum(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null) return findMinimum(root.right) + 1;
        if (root.right != null) return findMinimum(root.left) + 1;
        return Math.min(findMinimum(root.left), findMinimum(root.right)) + 1;
    }

    public static int findMinimum1(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null) {
            return 1 + findMinimum(root.right);
        }
        if (root.right == null) {
            return 1 + findMinimum(root.left);
        }

        return 1 + Math.min(findMinimum(root.left), findMinimum(root.right));
    }
}
