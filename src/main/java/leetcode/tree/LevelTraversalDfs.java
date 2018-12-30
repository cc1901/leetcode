package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class LevelTraversalDfs {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        if (root == null) {
            return results;
        }
        dfsTraversal(1, results, root);
        return results;
    }

    private void dfsTraversal(int level, List<List<Integer>> results, TreeNode node) {
        if (results.size() < level) {
            results.add(new ArrayList<>());
        }
        List<Integer> currentLevel = results.get(level -1);
        currentLevel.add(node.val);
        if (node.left != null) dfsTraversal(level + 1, results, node.left);
        if (node.right != null) dfsTraversal(level + 1, results, node.right);
    }
}
