class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int output = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                // visited[i] = true;
                output++;
                dfs(isConnected, visited, i);
            }
        }

        return output;
    }

    public void dfs(int[][] isConnected, boolean[] visited, int city) {
        if (visited[city]) return;
        visited[city] = true;
        for (int i = 0; i < isConnected[0].length; i++) {
            if (isConnected[city][i] == 1) {
                dfs(isConnected, visited, i);
            }
        }
    }
}