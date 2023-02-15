/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int cur=root.val;
        // example current: 6, p: 7 and q: 9 => go to right
        if(cur<p.val&&cur<q.val) return lowestCommonAncestor(root.right,p,q);
        // example current: 6, p: 2 and q: 4 => go to left
        if(cur>p.val&&cur>q.val) return lowestCommonAncestor(root.left,p,q); 
        return root;
    }
}