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
    public boolean isValidBST(TreeNode root) {
        /*
        Do any traversal and check for violation (left < root < right)
        in This example: inorder traversal using stack
        
        */
        Stack<TreeNode> stack = new Stack<>();
        //List<Integer> list = new ArrayList<>();
        TreeNode preRoot = null;
        while (root != null || !stack.isEmpty()) {
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            //list.add(root.val);
            if (preRoot != null && preRoot.val >= root.val) return false;
            preRoot = root;
            root = root.right;
        }
        return true;
    }
    
}