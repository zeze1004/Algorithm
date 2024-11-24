class Solution {
    public void rotate(int[][] matrix) {
        int num = matrix.length;

        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                int tmp = matrix[i][j];
                // System.out.print(matrix[i][j] + " " + matrix[j][i] + " ");
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;   
            }
            // System.out.println();
        }

        // System.out.println();

        // for (int i = 0; i < num; i++) {
        //     for (int j = 0; j < num; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num / 2; j++) { // 가운데를 두고 reverse
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][num - 1 - j]; // j가 0일 때는 0행과 끝 행을 reverse
                matrix[i][num - 1 - j] = tmp;
            }
        }
    }
}