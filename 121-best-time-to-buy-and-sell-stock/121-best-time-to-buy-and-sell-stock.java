class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return -1;
        }
        
        int currentMaxProfit = 0; // No profit
        int buy = prices[0];
        for (int i=0;i<prices.length;i++) {
            if (buy > prices[i]) { // buy at low
                buy = prices[i];
            }
            int profit = prices[i] - buy; // find profit if we sell current price
            if (currentMaxProfit < profit) { // check if the profit is already greater than currentMaxProfit
                currentMaxProfit = profit;
            }
        }
        return currentMaxProfit;
    }
}