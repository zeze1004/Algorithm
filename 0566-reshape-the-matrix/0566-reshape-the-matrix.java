class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] output = new int[r][c];
        int x = mat.length, y = mat[0].length;
        if (r * c != x * y) return mat;

        for (int i = 0; i < r * c; i++) {
            output[i/c][i%c] = mat[i/y][i%y];
        }

        return output;
    }
}