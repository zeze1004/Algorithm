class Solution {
    public int maxProfit(int[] prices, int fee) {
        int sell = 0;         // 첫 날에는 주식을 팔 수 없음
        int buy = -prices[0]; // 첫 날에 주식을 구매했을 때 보유액

        // 각 날에 대한 DP 계산
        for (int i = 1; i < prices.length; i++) {
            sell = Math.max(sell, buy + prices[i] - fee); // 주식을 팔지 않거나, 팔았을 때 금액 비교
            buy = Math.max(buy, sell - prices[i]); // 주식을 사지 않거나, 주식을 판 금액으로 주식을 샀을 때의 금액 비교
        }

        return sell; // 최종적으로 주식을 팔았을 때 최대 이익
    }
}