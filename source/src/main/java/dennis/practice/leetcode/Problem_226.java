package dennis.practice.leetcode;

import dennis.practice.leetcode.collection.TreeNode;

public class Problem_226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) {
            return root;
        }
                
        TreeNode temp = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(temp);
        
        return root;
    }
}
