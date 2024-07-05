class Solution {
    public String tictactoe(int[][] moves) {
        int[][] board = new int[3][3];
        int countA = 0, countB = 0;
    
        for (int i = 0; i < moves.length; i++) {
            int x = moves[i][0];
            int y = moves[i][1];
            
            if (i % 2 == 0) board[x][y] = 1;
            else board[x][y] = 2;
        }

        // x 첫째 줄 검사: 열 검사
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == 1) {
                if (board[1][i] == 1 && board[2][i] == 1) return "A";
            } else if (board[0][i] == 2) {
                if (board[1][i] == 2 && board[2][i] == 2) return "B";
            }
        }

        // y 첫째 줄 검사: 행 검사
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == 1) {
                if (board[i][1] == 1 && board[i][2] == 1) return "A";
            } else if (board[i][0] == 2) {
                if (board[i][1] == 2 && board[i][2] == 2) return "B";
            }
        }

        // 양 대각선 검사
        // 우하향 대각선
        if (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) return "A";
        if (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2) return "B";

        // 우상향 대각선
        if (board[2][0] == 1 && board[1][1] == 1 && board[0][2] == 1) return "A";
        if (board[2][0] == 2 && board[1][1] == 2 && board[0][2] == 2) return "B";

        return "Draw";
    }
}