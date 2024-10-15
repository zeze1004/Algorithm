class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] isVisited = new boolean[isConnected.length];
        int output = 0;
        
        for (int i = 0; i < isVisited.length; i++) {
            if (isVisited[i] == false) {
                output++;
                dfs(isConnected, isVisited, i);
            } 
        }

        return output;
    }

    public void dfs(int[][] isConnected, boolean[] isVisited, int idx) {
        if (isVisited[idx] == true) return;
        else isVisited[idx] = true;
        for (int i = 0; i < isVisited.length; i++) {
            if (isConnected[idx][i] == 1) {
                dfs(isConnected, isVisited, i);
            }
        }
    }
}