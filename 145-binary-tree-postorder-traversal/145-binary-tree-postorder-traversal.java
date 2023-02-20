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

    private void postorderTraversalRecursive(TreeNode node) {
        if (node != null) {
            postorderTraversalRecursive(node.left);
            postorderTraversalRecursive(node.right);
            answer.add(node.val);
        }
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        //recursive
        postorderTraversalRecursive(root);
        return answer;
        
        //non-recursive
        /*
        List<Integer> postorderResult = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
    
        if (root == null) {
            return postorderResult;
        }
        
        TreeNode curr = root;
        stack.push(curr);
        
        while(!stack.isEmpty()) {
            curr = stack.pop();
            postorderResult.add(curr.val);
            
            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            } 
        }
        return postorderResult;
        */
    }
}
