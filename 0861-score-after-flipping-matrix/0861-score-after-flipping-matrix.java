class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length;    // 그리드의 행 개수
        int n = grid[0].length; // 그리드의 열 개수
        int score = 0;          // 최종 점수를 저장할 변수

        // 첫 번째 열을 모두 1로 만들기
        for (int i = 0; i < m; i++) {        // 각 행에 대해 반복
            if (grid[i][0] == 0) {           // 첫 번째 열의 값이 0이면
                toggleRow(grid, i);          // 해당 행을 토글
            }
        }

        // 열 단위로 최댓값 만들기
        for (int j = 1; j < n; j++) {        // 두 번째 열부터 마지막 열까지 반복
            int count = 0;                   // 현재 열에서 1의 개수를 세기 위한 변수
            for (int i = 0; i < m; i++) {    // 각 행에 대해 반복
                if (grid[i][j] == 1) {       // 현재 열의 값이 1이면
                    count++;                 // 1의 개수 증가
                }
            }
            if (count <= m / 2) {            // 1의 개수가 행 개수의 절반 이하이면
                toggleCol(grid, j);          // 해당 열을 토글
            }
        }

        // 점수 계산하기
        for (int i = 0; i < m; i++) {        // 각 행에 대해 반복
            int rowScore = 0;                // 현재 행의 점수를 저장할 변수
            for (int j = 0; j < n; j++) {    // 각 열에 대해 반복
                rowScore = rowScore * 2 + grid[i][j];  // 이진수로 해석하여 점수 계산
            }
            score += rowScore;               // 행 점수를 최종 점수에 더함
        }

        return score;  // 최종 점수 반환
    }

    // 행 토글 메서드
    private void toggleRow(int[][] grid, int row) {
        for (int j = 0; j < grid[0].length; j++) {  // 해당 행의 모든 열에 대해 반복
            grid[row][j] = 1 - grid[row][j];        // 0은 1로, 1은 0으로 토글
        }
    }

    // 열 토글 메서드
    private void toggleCol(int[][] grid, int col) {
        for (int i = 0; i < grid.length; i++) {     // 해당 열의 모든 행에 대해 반복
            grid[i][col] = 1 - grid[i][col];        // 0은 1로, 1은 0으로 토글
        }
    }
}