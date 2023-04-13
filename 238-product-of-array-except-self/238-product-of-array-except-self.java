class Solution {
    public int[] productExceptSelf(int[] nums) {
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
    }
}