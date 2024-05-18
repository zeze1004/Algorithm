class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        # DP 배열 초기화
        dp = [[0] * n for _ in range(m)]

        # 0행과 0열을 1로 초기화
        for i in range(n):
            dp[0][i] = 1
        for i in range(m):
            dp[i][0] = 1
        
        # 바로 위에서 내려온 경로의 총 경우의 수와 왼쪽에서 오른쪽으로 오는 총 경우의 수를 더한다
        for i in range(1, m):
            for j in range(1, n):
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
        
        return dp[m - 1][n - 1]
        
        