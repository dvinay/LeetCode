class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int evenPointer = 0;
        int oddPointer = nums.length-1;
        int index=0;
        if (nums.length == 0 || nums.length == 1) {
            return nums;
        }
        while (evenPointer<oddPointer && index<nums.length ) {
            if (nums[index] % 2 == 0) {
                nums[evenPointer] = nums[index];
                evenPointer++;
                index++;
            } else {
                int temp = nums[oddPointer];
                nums[oddPointer] = nums[index];
                nums[index] = temp;
                oddPointer--;
            }
        }
        return nums;
    }
}