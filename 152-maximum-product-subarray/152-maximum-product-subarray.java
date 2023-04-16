class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        int minProduct = nums[0];
        int maxProduct = nums[0];
        int result = nums[0];
        for (int index = 1 ; index < nums.length ; index++) {
            if (nums[index] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            minProduct = Math.min(nums[index], nums[index]*minProduct);
            maxProduct = Math.max(nums[index], nums[index]*maxProduct);
            result = Math.max(maxProduct, result);
        }
        return result;
        
        // ***** current product approach *****
        /*
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
        */
        
        // ***** traversal approach *****
        /*
        int result = Integer.MIN_VALUE;
        int product = 1;
        
        for (int i=0;i<nums.length;i++) {
            product *= nums[i];
            result = Math.max(result,product);
            if (product == 0) {
                product = 1;
            }
        }
        
        product = 1;
        for (int i=nums.length-1;i>=0;i--) {
            product *= nums[i];
            result = Math.max(result,product);
            if (product == 0) {
                product = 1;
            }
        }
        
        return result;
        */
    }
}