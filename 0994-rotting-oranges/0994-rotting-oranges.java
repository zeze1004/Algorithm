class Solution {
    public int orangesRotting(int[][] grid) {
        int[] dx = new int[]{0, 0, 1, -1};
        int[] dy = new int[]{-1, 1, 0, 0};
        Queue<int[]> que = new LinkedList<>();
        int output = 0;
        int freshNum = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    que.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) freshNum++;
            }
        }
        if (freshNum == 0) return 0;

        while (!que.isEmpty()) {
            int size = que.size();

            for (int q = 0; q < size; q++) {
                int[] cur = que.poll();
                int x = cur[0], y = cur[1];

                for (int d = 0; d < 4; d++) {
                    int nextX = x + dx[d];
                    int nextY = y + dy[d];

                    if (nextX >= 0 && nextY >= 0 && nextX < grid.length && nextY < grid[0].length &&
                    grid[nextX][nextY] == 1) {
                        grid[nextX][nextY] = 2;
                        que.offer(new int[]{nextX, nextY});
                    }
                }
            }
            output++;
        }

        // for (int i = 0; i < grid.length; i++) {
        //     System.out.println("");
        //     for (int j = 0; j < grid[0].length; j++) {
        //         System.out.printf("%d ", grid[i][j]);
        //     }
        // }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return output - 1;
    }
}