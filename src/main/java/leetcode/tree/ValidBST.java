package leetcode.tree;

public class ValidBST {

    public boolean isValidBST(leetcode.tree.TreeNode root) {
        return isValidBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    private boolean isValidBST(TreeNode node, int max, int min) {
        if (node == null) {
            return true;
        }

        return isValidBST(node.left, node.val, Integer.MIN_VALUE)
                && isValidBST(node.right, Integer.MAX_VALUE, node.val);
    }
}
