import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1051 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int[][] square = new int[X + 1][Y + 1];

        for (int i = 0; i < X; i++) {
            st = new StringTokenizer(br.readLine());
            String tmp = st.nextToken();

            for (int j = 0; j < Y; j++) {
                int num = tmp.charAt(j) - '0';
                square[i][j] = num;
            }
        }

        int max_length = Math.max(X, Y); // 정사각형은 X, Y 의 길이보다 클 수 없다.
        int res = 1;

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                int compare_num = square[i][j];
                for (int length = 1; length < max_length; length++) {
                    if (
                        i + length < X &&
                        j + length < Y &&
                        square[i + length][j] == compare_num &&
                        square[i][j + length] == compare_num &&
                        square[i + length][j + length] == compare_num
                    ) {
                        res = Math.max(res, length + 1);
                    }
                }
            }
        }
        System.out.print(res * res);
    }
}
