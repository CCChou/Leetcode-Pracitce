package dennis.practice.leetcode;

import dennis.practice.leetcode.collection.TreeNode;

public class Problem_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return toBST(nums, 0, nums.length - 1);
    }

    private TreeNode toBST(int[] nums, int start, int end) {
        if (start == end) {
            return new TreeNode(nums[start]);
        } else if (start > end) {
            return null;
        }

        int half = (end - start) / 2 + start;
        TreeNode root = new TreeNode(nums[half]);
        TreeNode left = toBST(nums, start, half - 1);
        TreeNode right = toBST(nums, half + 1, end);

        root.left = left;
        root.right = right;

        return root;
    }
}
