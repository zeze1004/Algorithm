class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] output = new int[m][n];

        if (m * n != original.length) {
            int[][] emptyList = new int[0][0];
            return emptyList;
        }

        for (int i = 0; i < original.length; i++) {
            output[i / n][i % n] = original[i];
        }

        return output;
    }
}