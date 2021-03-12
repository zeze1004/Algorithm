class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_num = max(prices)
        result = 0
        for i in prices:
            min_num = min(min_num, i)
            result = max(i - min_num, result)

        return result
