class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int x = king[0], y = king[1];
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(queens, (a, b) -> Integer.compare(a[0], b[0]));
        boolean right = false, left = false, up = false, down = false;
        boolean diagonalRU = false, diagonalLU = false, diagonalRD = false, diagonalLD = false;
        int[][] board = new int[8][8];

        for (int i = 0; i < queens.length; i++) {
            int tmpX = queens[i][0];
            int tmpY = queens[i][1];
            board[tmpX][tmpY] = 1;
        }

        // 킹의 자리부터 순회
        // 오른쪽 순회
        for (int j = y + 1; j < 8; j++) {
            if (board[x][j] == 1) {
                output.add(Arrays.asList(x, j));
                break;
            }
        }


        // 왼쪽 순회
        for (int j = y - 1; j >= 0; j--) {
            if (board[x][j] == 1) {
                output.add(Arrays.asList(x, j));
                break;
            }
        }

        // 위 순회
        for (int i = x - 1; i >= 0; i--) {
            if (board[i][y] == 1) {
                output.add(Arrays.asList(i, y));
                break;
            }
        }

        // 아래쪽 순회
        for (int i = x + 1; i < 8; i++) {
            if (board[i][y] == 1) {
                output.add(Arrays.asList(i, y));
                break;
            }
        }

        // 우상향 대각선 순회
        for (int i = x - 1, j = y + 1; i >= 0 && j < 8; i--, j++) {
            if (board[i][j] == 1) {
                output.add(Arrays.asList(i, j));
                break;
            }
        }

        // 우하향 대각선 순회
        for (int i = x + 1, j = y + 1; i < 8 && j < 8; i++, j++) {
            if (board[i][j] == 1) {
                output.add(Arrays.asList(i, j));
                // System.out.printf("우하향 대각선 순회 - x: %d, y: %d\n", i, j);
                break;
            }
        }

        // 좌상향 대각선 순회
        for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                output.add(Arrays.asList(i, j));
                // System.out.printf("좌상향 대각선 순회 - x: %d, y: %d\n", i, j);
                break;
            }
        }

        // 좌하향 대각선 순회
        for (int i = x + 1, j = y - 1; i < 8 && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                output.add(Arrays.asList(i, j));
                break;
            }
        }

        return output;
    }
}
