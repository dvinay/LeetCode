class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return -1;
        }
        
        int maxProfit = 0;
        int buy = prices[0]; // buy at low
        for (int i=0;i<prices.length;i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            }
            int profit = prices[i] - buy;
            if (maxProfit < profit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}