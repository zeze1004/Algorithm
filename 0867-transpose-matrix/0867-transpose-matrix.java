class Solution {
    public int[][] transpose(int[][] matrix) {
        int xLen = matrix.length;
        int yLen = matrix[0].length;

        int[][] output = new int[yLen][xLen];
        
        for (int i = 0; i < yLen; i++) {
            for (int j = 0; j < xLen; j++) {
                output[i][j] = matrix[j][i];
            }
        }

        return output;
    }
}