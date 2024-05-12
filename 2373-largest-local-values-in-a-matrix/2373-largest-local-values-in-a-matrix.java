class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length - 2;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = getMaxValue(grid, i,j);
            }
        }
        return matrix;
    }

    private int getMaxValue(int[][] grid, int x, int y) {
        int max = Integer.MIN_VALUE;
        for (int i = x; i < x + 3 ; i++) {
            for (int j = y; j < y + 3; j++) {
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }
}