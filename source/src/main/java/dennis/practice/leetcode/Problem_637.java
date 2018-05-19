package dennis.practice.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import dennis.practice.leetcode.collection.TreeNode;

public class Problem_637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        if(root == null) return result;
        queue.offer(root);
        
        TreeNode qRoot;
        double sum;
        while(!queue.isEmpty()) {
            int length = queue.size();
            sum = 0.0;
            for(int i=0; i<length; i++) {
                qRoot = queue.poll();
                if(qRoot.left != null) queue.offer(qRoot.left);
                if(qRoot.right != null) queue.offer(qRoot.right);
                sum += qRoot.val;
            }
            result.add(sum/length);
        }
        
        return result;
    }
}
