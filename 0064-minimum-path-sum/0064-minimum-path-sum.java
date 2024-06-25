class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        int tmp = 0;

        // x 첫 줄
        for (int j = 0; j < grid[0].length; j++) {
            dp[0][j] = grid[0][j] + tmp;
            tmp = dp[0][j];
        }

        tmp = 0;

        // y 첫 줄
        for (int i = 0; i < grid.length; i++) {
            dp[i][0] = grid[i][0] + tmp;
            tmp = dp[i][0];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                if (dp[i - 1][j] >= dp[i][j - 1]) {
                    dp[i][j] = dp[i][j - 1] + grid[i][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + grid[i][j];
                }
            }
        }

        // for (int i = 0; i < dp.length; i++) {
        //     System.out.printf("\n");
        //     for (int j = 0; j < dp[0].length; j++) {
        //         System.out.printf("%d ", dp[i][j]);
        //     }
        // }

        return dp[grid.length - 1][grid[0].length - 1];
    }
}