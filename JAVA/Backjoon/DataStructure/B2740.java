import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2740 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N][M];

        // A 행렬
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] B = new int[M][K];

        // B 행렬
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] ANS = new int[N][K];

        for (int n = 0; n < N; n++) {
            for (int k = 0; k < K; k++) {
                for (int m = 0; m < M; m++) {
                    ANS[n][k] += A[n][m] * B[m][k];
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                System.out.print(ANS[i][j] + " ");
            }
            System.out.println();
        }
    }
}
