class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] data = new int[amount+1];
        Arrays.fill(data, amount+1);
        data[0] = 0;
        for (int i=1;i<amount+1;i++) {
            for (int c : coins) {
                if (i-c >=0) {
                    data[i] = Math.min(data[i], 1 + data[i-c]);
                }
            }
        }
            
        return data[amount] != amount+1 ? data[amount] : -1;
    }
}