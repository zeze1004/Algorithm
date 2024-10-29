class Solution {
    int[] dx = {-1, 0, 1};
    int[] dy = {1, 1, 1};
    public int maxMoves(int[][] grid) {
        int[][] cache = new int[grid.length][grid[0].length];
        int output = 0;

        for (int i = 0; i < grid.length; i++) {
            dfs(grid, cache, i, 0);
        }

        for (int[] tmp : cache) {
            // System.out.println("");
            for (int i : tmp) {
                // System.out.printf("%d ", i);
                output = Math.max(output, i);
            }
        }

        return output;
    }

    private void dfs(int[][] grid, int[][] cache, int x, int y) {
        // if (cache[x][y] != 0) {
        //     return;
        // }

        for (int i = 0; i < 3; i++) {
            int nextX = dx[i] + x;
            int nextY = dy[i] + y;

            if (nextX < 0 || nextY < 0 || nextX >= grid.length || nextY >= grid[0].length ||
                grid[nextX][nextY] <= grid[x][y] || cache[nextX][nextY] != 0) {
                continue;
            }
            // System.out.println("grid[" + nextX +"][" + nextY +"]: " + grid[nextX][nextY] +
            //                     ", grid[" + x +"][" + y + "]: " + grid[x][y]);
            cache[nextX][nextY] += cache[x][y] + 1;
            dfs(grid, cache, nextX, nextY);
        }
        
    }
}