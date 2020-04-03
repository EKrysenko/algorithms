package topics.tree;

public class ArrayToBST {
    public static TreeNode recursiveSolution(int[] nums) {

        return recursiveSplit(nums, 0, nums.length - 1);
    }

    private static TreeNode recursiveSplit(int[]nums, int start, int end) {
        if (end < start) return null;
        int middle = start + (end - start) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = recursiveSplit(nums, start, middle - 1);
        node.right = recursiveSplit(nums, middle + 1, end);
        return node;
    }
}
