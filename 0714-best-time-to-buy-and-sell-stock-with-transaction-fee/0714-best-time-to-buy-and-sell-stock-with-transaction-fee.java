class Solution {
    public int maxProfit(int[] prices, int fee) {
        int buy = -prices[0]; // 첫 날 샀을 때 금액
        int sell = 0;         // 첫 날 안 사서 못 팔았을 때 금액

        for (int i = 1; i < prices.length; i++) {
            buy = Math.max(buy, sell - prices[i]); // 안 사거나 팔고 남은 금액에서 주식을 사거나
            sell = Math.max(sell, buy + prices[i] - fee); // 안 팔거나 사고 남은 금액에 수익을 더하거나
            // fee는 사고 팔 때 한 번만 제하면 됨
        }        

        return sell; // 팔고 남았을 때 금액이 최대 수익
    }
}