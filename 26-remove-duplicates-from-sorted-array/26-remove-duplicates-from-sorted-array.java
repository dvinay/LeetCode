class Solution {
    public int removeDuplicates(int[] nums) {
        int i, j;
        for (i = 1, j = 1 ; i < nums.length ; i++) {
            if (nums[i-1] != nums[i]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}