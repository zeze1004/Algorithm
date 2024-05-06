class L59 {
    public int[][] generateMatrix(int n) {
        boolean[][] isVisited = new boolean[n][n];
        int[][] output = new int[n][n];

        int x = 0, y = 0, idx = 1;
        output[x][y] = 1;
        isVisited[x][y] = true;

        int tmp = n + (n - 1);

        while (tmp-- > 0) {
            // 오른쪽으로 이동
            while (y + 1 < n && !isVisited[x][y + 1]) {
                y++; idx++;
                isVisited[x][y] = true;
                output[x][y] = idx;
            }

            // 아래로 이동
            while (x + 1 < n && !isVisited[x + 1][y]) {
                x++; idx++;
                isVisited[x][y] = true;
                output[x][y] = idx;
            }

            // 왼쪽으로 이동
            while (y - 1 >= 0 && !isVisited[x][y - 1]) {
                y--; idx++;
                isVisited[x][y] = true;
                output[x][y] = idx;
            }

            // 위로 이동
            while (x - 1 >= 0 && !isVisited[x - 1][y]) {
                x--; idx++;
                isVisited[x][y] = true;
                output[x][y] = idx;
            }
        }

        return output;
    }
}
