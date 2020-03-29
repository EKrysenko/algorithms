package topics.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    private static List<List<Integer>> list = new ArrayList<>();

    public static List<List<Integer>> recursiveSolution(TreeNode root) {
        if (root == null) return Collections.emptyList();

        list.add(new ArrayList<>());
        recursion(root, 0);
        Collections.reverse(list);
        return list;
    }
    private static void recursion(TreeNode node, int level) {
        if (node == null) return;

        if (level > list.size() - 1) list.add(new ArrayList<>());

        list.get(level).add(node.val);
        recursion(node.left, level + 1);
        recursion(node.right,level + 1);

    }

    public static List<List<Integer>> iterativeSolution(TreeNode root) {
        if (root == null) return Collections.emptyList();

        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.singletonList(root.val));

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);

        int nextLevelSize = nodeQueue.size();
        int count = 0;

        while (!nodeQueue.isEmpty()) {
            TreeNode currentNode = nodeQueue.poll();
            if (currentNode.left != null) nodeQueue.add(currentNode.left);
            if (currentNode.right != null) nodeQueue.add(currentNode.right);
            count++;
            if (count == nextLevelSize) {
                List<Integer> level = new ArrayList<>();
                for (TreeNode node : nodeQueue) {
                    level.add(node.val);
                }
                if (!level.isEmpty()) result.add(level);
                count = 0;
                nextLevelSize = nodeQueue.size();
            }
        }

        Collections.reverse(result);
        return result;
    }
}
