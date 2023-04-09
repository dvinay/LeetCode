class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        int runningProduct = 1;
        
        //left Pass. product of i is product from 0th to i-1
        result[0] = 1;
        for(int i = 0; i < nums.length; i++){
            result[i] = runningProduct; //keep product of nums until ith
            runningProduct *= nums[i];
        }
        
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+",");
        }
        
        //right pass. product of i is product from n-1th to i+1
        runningProduct = 1;
        for(int i = nums.length-1 ; i >= 0 ; i--){
            result[i] = result[i] * runningProduct;
            runningProduct *= nums[i];//update the runningProduct
        }
        return result; 
    }
}