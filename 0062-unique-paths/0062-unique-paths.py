class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        dp = [[0] * n for _ in range(m)]
        
        # 0행, 0열을 일직선으로 쭉 가는 경로의 경우의 수는 1
        for y in range(n):
            dp[0][y] = 1
        for x in range(m):
            dp[x][0] = 1
        
        for x in range(1, m):
            for y in range(1, n):
                dp[x][y] = dp[x - 1][y] + dp[x][y - 1]
        
        return dp[m - 1][n - 1]
   