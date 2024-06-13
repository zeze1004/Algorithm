class Solution {
    public int numRookCaptures(char[][] board) {
        int output = 0;
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    // 사방검색
                    // 위로 검색
                    if (i < board.length - 1) {
                        for (int up = i + 1; up < board.length; up++) {
                            if (board[up][j] == 'B' || board[up][j] == 'R') break;
                            if (board[up][j] == 'p') {
                                output++;
                                break;
                            }
                        }
                    }

                    // 아래로 검색
                    if (i > 0) {
                        for (int down = i - 1; down >= 0; down--) {
                            if (board[down][j] == 'B' || board[down][j] == 'R') break;
                            if (board[down][j] == 'p') {
                                output++;
                                break;
                            }
                        }
                    }

                    // 오른쪽으로 검색
                    if (j < board[0].length - 1) {
                        for (int right = j + 1; right < board[0].length; right++) {
                            if (board[i][right] == 'B' || board[i][right] == 'R') break;
                            if (board[i][right] == 'p') {
                                output++;
                                break;
                            }
                        }
                    }

                    // 왼쪽으로 검색
                    if (j > 0) {
                        for (int left = j - 1; left >= 0; left--) {
                            if (board[i][left] == 'B' || board[i][left] == 'R') break;
                            if (board[i][left] == 'p') {
                                output++;
                                break;
                            }
                        }
                    }
                }
            }
        }

        return output;
    }
}