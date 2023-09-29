class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        
        int init = nums[0];
        boolean isMonotonicIncrease = true;
        boolean isMonotonicDecrease = true;
        
        for (int index=1;index<nums.length && (isMonotonicIncrease || isMonotonicDecrease);index++) {
            if (nums[index-1] < nums[index]) {
                isMonotonicDecrease = false;
            } else if (nums[index-1] > nums[index]) {
                isMonotonicIncrease = false;
            }
        }
        return (isMonotonicIncrease || isMonotonicDecrease);
    }
}