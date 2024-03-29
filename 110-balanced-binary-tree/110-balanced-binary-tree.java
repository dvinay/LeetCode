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
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        return Math.abs(getHeight(root.left) - getHeight(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);
        
    }
    
    // given node where left height - right height <= 1
    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(1+getHeight(root.left), 1+getHeight(root.right));
    }
}