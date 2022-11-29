/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return transverseTrees(root.left, root.right);
    }
    
    public boolean transverseTrees(TreeNode rootA, TreeNode rootB){
        if(rootA == null && rootB == null) return true;
        if(rootA == null || rootB == null) return false;
        if(rootA.val != rootB.val) return false;
        return transverseTrees(rootA.left, rootB.right) && transverseTrees(rootA.right, rootB.left);  
    }
}
