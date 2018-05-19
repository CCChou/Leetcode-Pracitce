package dennis.practice.leetcode;

import java.util.Arrays;

import dennis.practice.leetcode.collection.TreeNode;

public class Problem_654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }

        int index = 0, max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }

        TreeNode node = new TreeNode(max);
        node.left = index == 0 ? null : constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, index));
        node.right = index == nums.length - 1 ? null
                : constructMaximumBinaryTree(Arrays.copyOfRange(nums, index + 1, nums.length));

        return node;
    }
}
