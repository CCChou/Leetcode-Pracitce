package dennis.practice.leetcode;

import dennis.practice.leetcode.collection.TreeNode;

public class Problem_112 {
    public class Solution {
        public boolean hasPathSum(TreeNode root, int sum) {
            if (root == null)
                return false;
            // The node should be the leaf node at which the sum is equal to its value.
            if (root.val == sum && root.left == null && root.right == null)
                return true;
            // keep reducing the sum during recursion until it is equal to the value of leaf
            // node.
            return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        }
    }
}
