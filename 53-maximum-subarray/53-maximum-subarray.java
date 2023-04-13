class Solution {
    public int maxSubArray(int[] nums) {
        int curretMaximum = nums[0];
        int maximum = nums[0];
        
        for (int index=1;index<nums.length;index++) {
            curretMaximum = Math.max(curretMaximum+nums[index], nums[index]);
            if (curretMaximum > maximum) {
                maximum = curretMaximum;
            }
        }
        return maximum;
    }
}