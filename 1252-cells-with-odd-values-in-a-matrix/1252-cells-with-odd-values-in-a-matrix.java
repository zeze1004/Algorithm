class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int output = 0;
        
        for (int i = 0; i < indices.length; i++) {
            int x = indices[i][0];
            int y = indices[i][1];
            
            for (int low = 0; low < n; low++) {
                matrix[x][low]++;
            }

            for (int row = 0; row < m; row++) {
                matrix[row][y]++;
            }
        }

        for (int[] mat : matrix) {
            for (int i = 0; i < mat.length; i++) {
                if (mat[i] % 2 == 1) output++;
            }
        }

        return output;
    }
}