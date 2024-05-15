class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int m = mat.length, n = mat[0].length;
        int[] output = new int[m * n];
        int row = 0, col = 0, idx = 0;
        
        for (int i = 0; i < m + n - 1; i++) {
            if (i % 2 == 0) {
                // 우상향 대각선
                while (row >= 0 && col < n) {
                    output[idx++] = mat[row][col];
                    row--;
                    col++;
                }
                if (col < n) {
                    row++;
                } else {
                    row += 2;
                    col--;
                }
            } else {
                // 좌하향 대각선
                while (row < m && col >= 0) {
                    output[idx++] = mat[row][col];
                    row++;
                    col--;
                }
                if (row < m) {
                    col++;
                } else {
                    col += 2;
                    row--;
                }
            }
        }
        
        return output;

        /*
        int xLen = mat.length, yLen = mat[0].length, num = xLen * yLen;
        int[] output = new int[num];
        boolean[][] visited = new boolean[xLen][yLen];
        int x = 0, y = 0, count = 0;

        output[count] = mat[x][y];
        output[num - 1] = mat[xLen - 1][yLen - 1];
        visited[count][count] = true;
        visited[xLen - 1][yLen - 1] = true;

        int tmp = num - 2; 
        
        while (tmp -- > 0) {
            // 좌하향 시작점
            if (x == 0 && y + 1 < yLen && !visited[x][y + 1]) { // (0,0)이후 시작점 어케 잡지?
                y++; count++;
                output[count] = mat[x][y];
                visited[x][y] = true;
            }

            // 좌하향 대각선
            while (x + 1 < xLen && y - 1 >= 0 && !visited[x + 1][y - 1]) {
                x++; y--; count++;
                output[count] = mat[x][y];
                visited[x][y] = true;
            }

            // 우상향 시작점
            if (y == 0 && x + 1 < xLen && !visited[x + 1][y]) {
                x++; count++; 
                output[count] = mat[x][y];
                visited[x][y] = true;
            }

            // 우상향 대각선
            while (x - 1 >= 0 && y + 1 <= yLen && !visited[x - 1][y + 1]) {
                x--; y++; count++; 
                output[count] = mat[x][y];
                visited[x][y] = true;
            }
        }
        

        return output;
        */
    }
}