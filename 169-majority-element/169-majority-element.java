class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> countMap = new HashMap<>();
        
        for (int num:nums) {
            countMap.put(num, countMap.getOrDefault(num, 0)+1);
        }
        int maxCount = nums.length/2;
        for (Map.Entry<Integer,Integer> entry:countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                return entry.getKey();
            }
        }
        return -1;
    }
}