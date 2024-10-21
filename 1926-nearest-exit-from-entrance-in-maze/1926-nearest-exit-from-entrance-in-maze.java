class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int[] dx = new int[]{0, 0, 1, -1};
        int[] dy = new int[]{1, -1, 0, 0};

        Queue<int[]> que = new LinkedList<>();
        que.offer(entrance); // 동서남북 탐색할 경로를 큐에 넣어줌

        int step = 0;

        while (!que.isEmpty()) { // 탐색할 경로가 없을 때까지 루프
            int size = que.size();

            for (int i = 0; i < size; i++) {
                int[] cur = que.poll();
                int x = cur[0], y = cur[1];

                // 탈출구(maze 벽 쪽)에 도달했으면 step 리턴 (탈출경로와 출발점은 같을 수 없음)
                // 출입구를 중심으로 경로 조사를 했으므로 먼저 도달하는게 출입구에서 가장 가까운 이동 횟수
                if ((x != entrance[0] || y != entrance[1]) && (x == 0 || x == maze.length - 1 ||
                y == 0 || y == maze[0].length - 1)) {
                    return step;
                }

                // 동서남북으로 조사
                for (int d = 0; d < 4; d++) {
                    int nextX = x + dx[d];
                    int nextY = y + dy[d];

                    if (nextX >= 0 && nextY >= 0 && nextX < maze.length && nextY < maze[0].length) {
                        if (maze[nextX][nextY] == '.') {
                            maze[nextX][nextY] = '+'; // 방문 처리
                            que.offer(new int[]{nextX, nextY});
                        }
                    }
                }
            }
            step++;
        }

        return -1;
    }
}