class Solution {
    int[] dx = new int[]{0, 0, -1, 1};
    int[] dy = new int[]{1, -1, 0, 0};
    public int longestIncreasingPath(int[][] matrix) {
        int[][] memorization = new int[matrix.length][matrix[0].length];
        int output = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (memorization[i][j] == 0) {
                    dfs(matrix, memorization, i, j);
                }
            }
        }

        return output;
    }

    private int dfs(int[][] matrix, int[][] memorization, int x, int y) {
        if (memorization[x][y] != 0) return memorization[x][y];
        memorization[x][y]++;

        for (int d = 0; d < 4; d++) {
            int nextX = x + dx[d];
            int nextY = y + dy[d];

            if (nextX < 0 || nextY < 0 || nextX >= matrix.length || nextY >= matrix[0].length ||
            matrix[x][y] >= matrix[nextX][nextY]) continue;
            
            memorization[x][y] = Math.max(memorization[x][y], dfs(matrix, memorization, nextX, nextY) + 1);
        }

        return memorization[x][y];
    }
}
        