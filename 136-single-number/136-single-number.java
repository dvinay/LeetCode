class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> count = new HashMap();
        for (int data:nums) {
            count.put(data, count.getOrDefault(data, 0) + 1);
        }
        int result = 0;
        for(Map.Entry<Integer, Integer> m : count.entrySet()){
            if (m.getValue() == 1) {
                result = m.getKey();
            }
        }  
        return result;
    }
}