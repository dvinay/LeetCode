class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0;i<nums.length;i++) {
            if (map.containsKey(nums[i])) {
                results[0] = map.get(nums[i]);
                results[1] = i;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return results;
    }
}