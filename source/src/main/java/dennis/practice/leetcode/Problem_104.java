package dennis.practice.leetcode;

import dennis.practice.leetcode.collection.TreeNode;

public class Problem_104 {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
