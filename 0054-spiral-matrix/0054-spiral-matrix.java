class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        int x_len = matrix.length;
        int y_len = matrix[0].length;
        boolean[][] isVisited = new boolean[x_len][y_len];

        int count = x_len * y_len;
        int x = 0, y = 0;
        output.add(matrix[x][y]);
        isVisited[x][y] = true;
        while (count -- > 0) {
            // System.out.println(count);

            // 오른쪽으로 이동
            while (y + 1 < y_len && !isVisited[x][y + 1]) {
                y++;
                output.add(matrix[x][y]);
                isVisited[x][y] = true;
            }

            // 아래로 이동
            while (x + 1 < x_len && !isVisited[x + 1][y]) {
                x++; 
                output.add(matrix[x][y]);
                isVisited[x][y] = true;
            }

            // 왼쪽으로 이동
            while (y - 1 >= 0 && !isVisited[x][y - 1]) {
                y--; 
                output.add(matrix[x][y]);
                isVisited[x][y] = true;
            }

            // 위쪽으로 이동
            while (x - 1 >= 0 && !isVisited[x - 1][y]) {
                x--; 
                output.add(matrix[x][y]);
                isVisited[x][y] = true;
            }

        }

        
        return output;
    }
}