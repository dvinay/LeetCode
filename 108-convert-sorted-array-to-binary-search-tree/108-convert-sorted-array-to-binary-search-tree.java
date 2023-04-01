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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return null;
        }
        int right = nums.length;
        return balancedTree(nums, 0, right-1);
    }
    
    public TreeNode balancedTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right-left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = balancedTree(nums, left, mid-1);
        root.right = balancedTree(nums, mid+1, right);
        return root;
    }
}