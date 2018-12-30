package leetcode.tree;

import java.util.LinkedList;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        int level = 0;
        if(root == null) return level;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            level++;
            System.out.println(level);
            for(int i=0; i< queue.size(); i++) {
                TreeNode levelNode = queue.poll();
                System.out.print(levelNode.val);
                System.out.print(" ");
                if(levelNode.left != null) {
                    queue.add(levelNode.left);
                }
                if(levelNode.right != null) {
                    queue.add(levelNode.right);
                }
            }
            System.out.print("\n");
        }
        return level;
    }
//   0
//  2,4
//1,null,3,-1
//5,1,null,6,null,8
}
