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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        
        if (root != null) {
            // recursive way
            // inorderTraversalRecursive(root, result);
            
            // non-recursive way
            result = inorderTraversalNonRecursive(root);
        }
        
        return result;
    }
    
    // non-recursive way
    public List<Integer> inorderTraversalNonRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        TreeNode currentNode = root;
        while (currentNode != null || stack.size() > 0) {
            // travel left subtree
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            
            // take last node as currentNode is null
            currentNode = stack.pop();
            result.add(currentNode.val);
            
            // travle righ subtree
            currentNode = currentNode.right;
        }
        
        return result;
    }
    
    // recursive way
    public void inorderTraversalRecursive(TreeNode root, List<Integer> result) {
        inorderTraversalRecursive(root.left, result);
        result.add(root.val);
        inorderTraversalRecursive(root.right, result);
    }
}