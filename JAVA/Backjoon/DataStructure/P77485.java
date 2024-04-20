import java.util.Arrays;

public class P77485 {

    public static void main(String[] args) {

        int[][] queries = {
            {2,2,5,4},
            {3,3,6,6},
            {5,1,6,3}
        };

        solution(6, 6, queries);
    }

    public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = {};

        int count = 0;
        int[][] basic_matrix = new int[rows + 1][columns + 1];
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                basic_matrix[i][j] = ++count;
            }
        }

        int x1 = queries[0][0]; int y1 = queries[0][1];
        int tmp1 = basic_matrix[x1][y1];
        int tmp2 = basic_matrix[x1][y1 + 1];
        int tmp3 = basic_matrix[x1][y1 + 2];

        basic_matrix[x1][y1 + 1] = tmp1;
        basic_matrix[x1][y1 + 2] = tmp2;


        return answer;
    }

}
