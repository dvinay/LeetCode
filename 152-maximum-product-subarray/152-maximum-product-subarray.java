class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        int minProduct = nums[0];
        int maxProduct = nums[0];
        int result = nums[0];
        
        for (int index = 1 ; index < nums.length ; index++) {
            int temp = maxProduct;
            maxProduct = Math.max(Math.max(nums[index]*minProduct, nums[index]*maxProduct), nums[index]);
            minProduct = Math.min(Math.min(nums[index]*minProduct, nums[index]*temp), nums[index]);
            
            result = Math.max(maxProduct, result);
        }
        
        return result;
    }
    
}