class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            ans += counts.getOrDefault(num, 0);
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        return ans;
    }
}