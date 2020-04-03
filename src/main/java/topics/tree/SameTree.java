package topics.tree;

public class SameTree {
    public static boolean isSame(TreeNode p, TreeNode q) {
        if (p == null ^ q == null) return false;
        if (p == null) return true;

        if (p.val != q.val) return false;

        return isSame(p.right, q.right) && isSame(p.left, q.left);
    }
}
