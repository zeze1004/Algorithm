class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int[] dx = new int[]{0, 0, -1, 1};
        int[] dy = new int[]{1, -1, 0, 0};
        
        Queue<int[]> que = new LinkedList<>();
        que.offer(entrance);

        int step = 0, size = 0;
        int x = 0, y = 0;

        while (!que.isEmpty()) {
            size = que.size();

            for (int i = 0; i < size; i++) {
                int[] cur = que.poll();
                x = cur[0];
                y = cur[1];

                // 탈출구라면
                if ((x != entrance[0] || y != entrance[1]) && (x == 0 || x == maze.length - 1 ||
                y == 0 || y == maze[0].length - 1)) {
                    return step;
                } 

                for (int d = 0; d < 4; d++) {
                    int nextX = x + dx[d];
                    int nextY = y + dy[d];

                    if (nextX >= 0 && nextY >= 0 && nextX < maze.length && nextY < maze[0].length &&
                    maze[nextX][nextY] == '.') {
                        que.offer(new int[]{nextX, nextY});
                    }
                }
            }
            step++;
        }

        return -1;
    }
}