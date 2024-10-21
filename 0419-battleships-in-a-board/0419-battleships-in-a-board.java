class Solution {
    int output = 0;
    int[] dx = new int[]{0, 0, 1, -1};
    int[] dy = new int[]{-1, 1, 0, 0};
    public int countBattleships(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'X') {
                    dfs(board, i, j);
                    output++;
                }
            }
        }

        return output;
    }

    private void dfs(char[][] board, int x, int y) {
        if (board[x][y] != 'X') return;
        else {
            board[x][y] = '.';
        }
        
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX < 0 || nextY < 0 || nextX >= board.length || nextY >= board[0].length || board[nextX][nextY] == '.') {
                continue;
            }
            dfs(board, nextX, nextY);
        }
    }
}