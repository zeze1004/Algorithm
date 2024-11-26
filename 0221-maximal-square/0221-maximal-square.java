class Solution {
    public int maximalSquare(char[][] matrix) {
        int x = matrix.length, y = matrix[0].length;
        int[][] dp = new int[x + 1][y + 1];
        int maxLen = 0;

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    maxLen = Math.max(maxLen, dp[i][j]);
                }
            }
        }

        // for (int i = 0; i <= x; i++) {
        //     for (int j = 0; j <= y; j++) {
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        return maxLen * maxLen;
    }
}