class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = currentSum;
        for (int i=1;i<nums.length;i++) {
            currentSum = max(currentSum + nums[i], nums[i]);
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
    private int max(int a, int b) {
        return a > b ? a : b;
    }
}