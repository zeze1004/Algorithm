class Solution {
    int[] dx = new int[]{0, 0, 1, -1};
    int[] dy = new int[]{-1, 1, 0, 0};
    int output = 0;
    public int islandPerimeter(int[][] grid) {
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !isVisited[i][j]) {
                    dfs(grid, isVisited, i, j);
                }
            }
        }

        return output;
    }

    private void dfs(int[][] grid, boolean[][] isVisited, int x, int y) {
        if (isVisited[x][y]) return;
        isVisited[x][y] = true;
        
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX < 0 || nextY < 0 || nextX >= grid.length || nextY >= grid[0].length) {
                output++;
                continue;
            }

            if (grid[nextX][nextY] == 0) {
                // System.out.println("0");
                System.out.printf("%d, %d\n", nextX, nextY);
                output++;
            // } else if (grid[nextX][nextY] == 1) {
            //     if (nextX == 0 || nextX == grid.length - 1 || nextY == 0 || nextY == grid[0].length - 1) {
            //         output++;
            //         System.out.printf("%d, %d\n", nextX, nextY);
            //         if ((nextX == 0 && nextY == 0) || (nextX == grid.length - 1 && nextY == grid[0].length) ||
            //         (nextX == grid.length - 1 && nextY == 0) || (nextX == grid.length - 1 && nextY == grid[0].length)) {
            //             output++;
            //             System.out.println("333");
            //         }
            //     }
            }
        }
    }
}