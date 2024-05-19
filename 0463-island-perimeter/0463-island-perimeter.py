class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == 1:
                    return self.dfs(grid, i, j)
        
        return 0
    
    def dfs(self, grid, x, y) -> int:
        if x < 0 or x >= len(grid) or y < 0 or y >= len(grid[0]) or grid[x][y] == 0:
            return 1
        if grid[x][y] == -1:
            return 0
        grid[x][y] = -1
        output = 0
        
        output += self.dfs(grid, x + 1, y)
        output += self.dfs(grid, x - 1, y)
        output += self.dfs(grid, x, y + 1)
        output += self.dfs(grid, x, y - 1)

        return output
 