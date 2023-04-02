class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int data:nums) {
            result ^=data;
        }
          
        return result;
    }
}