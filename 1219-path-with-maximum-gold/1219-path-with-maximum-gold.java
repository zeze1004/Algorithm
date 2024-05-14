class Solution {
    int ans = 0;
    public int getMaximumGold(int[][] grid) {
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != 0){
                    dfs(grid,visited, i, j, 0);
                }
            }
        }
        
        return ans;
    }
    
    public void dfs(int[][] grid, boolean visited[][], int i , int j, int csum){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
            return;
        
        if(grid[i][j] == 0 || visited[i][j])
            return;
        
        visited[i][j] = true;
        csum = csum + grid[i][j];
        ans = Math.max(ans,csum);
        
        dfs(grid, visited, i+1,j,csum);
        dfs(grid, visited, i-1,j,csum);
        dfs(grid, visited, i,j+1,csum);
        dfs(grid, visited, i,j-1,csum);
        visited[i][j] = false;
    }
}

/*
class Solution {
    int output = 0;
    public int getMaximumGold(int[][] grid) {
        int x = grid.length, y = grid[0].length;
        boolean isVisited[][] = new boolean[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int sum = 0;
                if (grid[i][j] != 0) dfs(grid, isVisited, i, j, sum);
            }
        }

        return output;
    }

    public void dfs(int[][] grid, boolean isVisited[][], int i, int j, int sum) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return;
        if (grid[i][j] == 0 || isVisited[i][j]) return;

        isVisited[i][j] = true;
        sum += grid[i][j];
        output = Math.max(output, sum);

        dfs(grid, isVisited, i + 1, j, sum);
        dfs(grid, isVisited, i - 1, j, sum);
        dfs(grid, isVisited, i, j + 1, sum);
        dfs(grid, isVisited, i, j - 1, sum);

        isVisited[i][j] = false; // 탐색 후 시작점 방문 표시를 flase로 바꿔 다른 방향으로도 탐색할 수 있도록 함 
    }
}
*/