package topics.tree;

public class LowestCommonAncestor {
    public static TreeNode findLowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ((p.val == root.val || q.val == root.val)
                || (p.val < root.val && q.val > root.val)
                || (p.val > root.val && q.val < root.val)) return root;
        if (p.val < root.val) {
            root = root.left;
        } else root = root.right;

        return findLowestCommonAncestor(root, p, q);
    }
}
