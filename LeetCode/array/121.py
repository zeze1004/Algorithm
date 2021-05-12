class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_num = max(prices) # sys.maxsize
        result = 0
        # 최솟값과 최댓값을 계속 갱신
        for i in prices:
            min_num = min(min_num, i)
            result = max(i - min_num, result)

        return result
