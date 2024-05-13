class Solution {
    public int matrixScore(int[][] grid) {
        int x = grid.length;    
        int y = grid[0].length; 
        int output = 0;          

        // 0 번째 열을 모두 1로 만들기
        for (int i = 0; i < x; i++) {        
            if (grid[i][0] == 0) {           
                toggleRow(grid, i);          
            }
        }

        // 열의 1의 개수가 행(x) 개수의 절반이면 해당 열 토글
        for (int j = 1; j < y; j++) {        // 0번째 열은 1이므로 1번째 열부터 순회
            int count = 0;                   
            for (int i = 0; i < x; i++) {    
                if (grid[i][j] == 1) {       
                    count++;                 
                }
            }
            if (count <= x / 2) {            
                toggleCol(grid, j);          
            }
        }

        // 점수 계산
        for (int i = 0; i < x; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < y; j++) {
                sb.append(grid[i][j]);
            }
            output += Integer.parseInt(sb.toString(), 2);
        }

        return output;  
    }

    // 행 토글 
    private void toggleRow(int[][] grid, int row) {
        for (int j = 0; j < grid[0].length; j++) {  
            grid[row][j] = 1 - grid[row][j];        // 0은 1로, 1은 0으로 토글
        }
    }

    // 열 토글 
    private void toggleCol(int[][] grid, int col) {
        for (int i = 0; i < grid.length; i++) {     
            grid[i][col] = 1 - grid[i][col];        
        }
    }
}