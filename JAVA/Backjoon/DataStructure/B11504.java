import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        String[] input;
        StringBuilder board;
        int N, M, X, Y;

        while (T-- > 0) {
            input = br.readLine().split(" ");
            N = Integer.parseInt(input[0]);
            M = Integer.parseInt(input[1]);
            X = Integer.parseInt(br.readLine().replaceAll(" ", ""));
            Y = Integer.parseInt(br.readLine().replaceAll(" ", ""));
            board = new StringBuilder(br.readLine().replaceAll(" ", ""));
            int count = 0, firstIdx = 0;
            for (int i = 0; i < N; i++) {
                StringBuilder tmp = new StringBuilder();
                if (i > N - M) {
                    board.append(board.charAt(firstIdx));
                    firstIdx++;
                }
                for (int j = 0; j < M; j++) {
                    tmp.append(board.charAt(i + j));
                }
                if (Integer.parseInt(tmp.toString()) >= X && Integer.parseInt(tmp.toString()) <= Y) count++;
            }
            System.out.printf("%d\n", count);
        }
    }
}
