class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        def dfs(i, j):
            # grid 초과하는 경우
            if i < 0 or i >= len(grid) or j < 0 or j >= len(grid[0]) or grid[i][j] != '1':
                return

            grid[i][j] = 0

            # 상하좌우 탐색
            dfs(i + 1, j)
            dfs(i - 1, j)
            dfs(i, j - 1)
            dfs(i, j + 1)

        count = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                # 1이면 dfs 호출
                if grid[i][j] == '1':
                    dfs(i, j)
                    count += 1
        return count
