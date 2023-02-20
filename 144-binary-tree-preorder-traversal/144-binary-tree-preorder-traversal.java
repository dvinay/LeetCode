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
    private List<Integer> answer = new ArrayList<>();

    private void preorderTraversalRecursive(TreeNode node) {
        if (node != null) {
            answer.add(node.val);
            preorderTraversalRecursive(node.left);
            preorderTraversalRecursive(node.right);
        }
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        //recursive
        preorderTraversalRecursive(root);
        return answer;
    }
}