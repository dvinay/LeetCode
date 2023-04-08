class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        
        for (int num:nums) {
            countMap.put(num, countMap.getOrDefault(num, 0)+1);
            if (countMap.get(num) >= 2) {
                return true;
            }
        }
        return false;
    }
}