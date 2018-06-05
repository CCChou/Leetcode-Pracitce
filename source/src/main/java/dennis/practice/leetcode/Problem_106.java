package dennis.practice.leetcode;

import java.util.Arrays;

import dennis.practice.leetcode.collection.TreeNode;

// TODO 傳入中序和後序，組成正常 binary tree
// inorder = [9,1,3,15,20,7]
// postorder = [1,9,15,7,20,3]
public class Problem_106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }
    
    private TreeNode build(int[] inorder, int[] postorder, int sInorderIndex, int eInorderIndex, int sPostorderIndex, int ePostIndex) {
        if(ePostIndex > sPostorderIndex) {
            return null;
        }
        
        int rootNum = postorder[postorder.length];
        TreeNode root = new TreeNode(rootNum);

        if(sInorderIndex == eInorderIndex) {
            return root;
        }
        
        int rightIndex = -1;
        for(int i=sInorderIndex; i<=eInorderIndex; i++) {
            if(inorder[i] == rootNum) {
                rightIndex = i - 1;
            }
        }
        
        root.right = build(inorder, postorder, 0, rightIndex, 0, rightIndex);
        root.left = build(inorder, postorder, rightIndex + 2, eInorderIndex, rightIndex + 1, ePostIndex - 1);
        
        return root;
    }
    
    public static void main(String[] args) {
        Problem_106 test = new Problem_106();
        test.buildTree(new int[] {1,2,3,4,5},  new int[] {1,4,3,5,2});
    }
}
