package topics.tree;

public class InvertBT {
    public static TreeNode invert(TreeNode root){
        if (root == null) return root;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        root.left = invert(root.left);
        root.right = invert(root.right);

        return root;
    }
}
