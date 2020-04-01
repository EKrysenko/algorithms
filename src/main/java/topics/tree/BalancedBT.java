package topics.tree;

public class BalancedBT {
    public static boolean isBalancedRecursive(TreeNode root) {

        return findMaxDiff(root) != -1;
    }

    private static int findMaxDiff(TreeNode node) {
        if (node == null) return 0;
        int left = findMaxDiff(node.left);
        int right = findMaxDiff(node.right);
        if (left == -1 || right == -1 || Math.abs(left - right) >= 2) return -1;
        return Math.max(left, right) + 1;
    }
}
