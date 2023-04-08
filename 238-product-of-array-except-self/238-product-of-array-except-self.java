class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        int zerosCount = 0;

        for (int num:nums) {
            if (num != 0) {
                product *= num;
            } else {
                zerosCount++;
            }
            
        }
        
        if (zerosCount >= 2) {
            return result;
        }
        
        for (int i=0; i< nums.length; ++i) {
            int num = nums[i];
            
            if (zerosCount != 0) {
                result[i] = num == 0 ? product : 0;
            } else {
                result[i] = product/num;
            }
        }
        
        return result;
    }
}