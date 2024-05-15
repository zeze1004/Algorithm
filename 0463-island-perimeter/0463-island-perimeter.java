class Solution {
    public int islandPerimeter(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == 1) { // 처음 땅을 발견하고 더 이상 순회하지 않음
                    return dfs(i, j, grid, visited);
                }
            }
        }
        return 0;
    }

    public int dfs(int x, int y, int[][] grid, boolean[][] visited) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == 0) { // 범위를 초과한 경우는 경계가 드러나는 땅이라고 판단
            return 1;
        } else if (visited[x][y]) { // 주위에 이미 방문한 땅이 있으면 경계가 아니라 0을 리턴
            return 0;
        }
        
        visited[x][y] = true;
        int count = 0;

        count += dfs(x - 1, y, grid, visited);
        count += dfs(x + 1, y, grid, visited);
        count += dfs(x, y - 1, grid, visited);
        count += dfs(x, y + 1, grid, visited);

        return count;
    }
}