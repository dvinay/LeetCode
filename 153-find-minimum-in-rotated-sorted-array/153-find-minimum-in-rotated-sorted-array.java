class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int end = nums.length-1;
        
        while (low <= end) {
            int mid = (end - low)/2 + low;
            if (mid < end && nums[mid] > nums[mid+1]) {
                return nums[mid+1];
            }
            if (mid > low && nums[mid] < nums[mid-1]) {
                return nums[mid];
            }
            if (nums[mid] > nums[low]) {
                low = mid+1;
            } else {
                end = mid-1;
            }
        }
        return nums[0];
    }
}