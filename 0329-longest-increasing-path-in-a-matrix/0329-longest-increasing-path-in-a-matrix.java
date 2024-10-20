class Solution {
    int[] dx = new int[]{0, 0, 1, -1};
    int[] dy = new int[]{-1, 1, 0, 0};
    public int longestIncreasingPath(int[][] matrix) {
        int output = 1;
        int[][] momorization = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                output = Math.max(output, dfs(i, j, matrix, momorization));
            }
        }

        return output;
    }

    private int dfs(int x, int y, int[][] matrix, int[][] memorization) {
        // 경로 횟수가 저장된 memorization 배열에 값이 있으면 이미 탐색을 한 것이므로 리턴
        if (memorization[x][y] != 0) return memorization[x][y];

        int curLength = 1; // 시작할 때 경로 길이 1

        // 동서남북 순회
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            // 배열의 범위를 넘거나, next 수보다 작다면 continue
            if (nextX < 0 || nextY < 0 || nextX >= matrix.length || nextY >= matrix[0].length || 
            matrix[nextX][nextY] <= matrix[x][y]) {
                continue;
            }
            // 현재 길이와 다음 경로를 탐색했을 때 경로 길이 중 큰 값을 구함
            curLength = Math.max(curLength, 1 + dfs(nextX, nextY, matrix, memorization));
        }

        memorization[x][y] = curLength; // 동서남북으로 갈 수 있는 경로 중 제일 긴 경로 길이를 캐싱
        return curLength;
    }
}