package leetcode.tree;

public class RangeSumOfBST {

    public int rangeSumBST(TreeNode root, int L, int R) {
        int result = 0;
        if (root == null) return result;

        if (L < root.val) {
            result += rangeSumBST(root.left, L, R);
        }
        if (root.val >= L && root.val <= R) {
            result += root.val;
        }
        if (R > root.val) {
            result += rangeSumBST(root.right, L, R);
        }

        return result;
    }
}
