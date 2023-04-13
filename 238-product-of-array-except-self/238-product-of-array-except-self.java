class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int currentProduct = 1;
        // left pass
        for (int index = 0; index < nums.length ; index++) {
            result[index] = currentProduct;
            currentProduct *= nums[index];
        }
        currentProduct = 1;
        for (int index = nums.length-1; index >=0 ; index--) {
            result[index] = currentProduct*result[index];
            currentProduct *= nums[index];
        }
        /*
        for (int index = 0; index < nums.length ; index++) {
            System.out.println(result[index]);
        }
        */
        return result;
        /*
        int[] result = new int[nums.length];
        int numberOfZeros = 0;
        int product = 1;
        
        for (int num:nums) {
            if (num == 0) {
                numberOfZeros++;
            } else {
                product *= num;
            }
        }
        
        if (numberOfZeros >= 2) {
            return result;
        }
        
        for (int index = 0; index < nums.length ; index++) {
            if (numberOfZeros == 1) {
                result[index] = nums[index] == 0 ? product : 0;
            } else {
                result[index] = product/nums[index];
            }
        }
        return result;
        */
    }
}