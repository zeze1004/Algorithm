class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[n][m];
        for (int i = 0; i < m; i++) {
            grid[0][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            grid[i][0] = 1;
        }

        for (int y = 1; y < m; y++) {
            for (int x = 1; x < n; x++) {
                grid[x][y] = grid[x - 1][y] + grid[x][y - 1];
            }
        }

        return grid[n - 1][m - 1];
    }
}