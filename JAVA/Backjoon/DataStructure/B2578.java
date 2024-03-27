import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2578 {
    static int[][] bingo = new int[5][5];
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 우상향 대각선: x + y = 4
        // 좌상향 대각선: x == y

        int res = 0;

        // 사회자가 숫자 하나 씩 부름
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                res++;
                int num = Integer.parseInt(st.nextToken());
                if (bingoCheck(num)) {
                    System.out.println(res);
                    return;
                }
            }
        }
    }

    public static boolean bingoCheck(int num) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (bingo[i][j] == 0) {
                    continue;
                }

                if (bingo[i][j] == num) {
                    bingo[i][j] = 0;

                    int tmp = bingoIndex(i, j);

                    if (tmp >= 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int bingoIndex(int X, int Y) {
        int tmp = 0;

        // x축 먼저 순회
        for (int i = 0; i < 5; i++) {
            if (bingo[X][i] == 0) {
                tmp++;
            }
            if (tmp == 5) {
                count++;
            }
        }

        tmp = 0;


        // y축 순회
        for (int i = 0; i < 5; i++) {
            if (bingo[i][Y] == 0) {
                tmp++;
            }
            if (tmp == 5) {
                count++;
            }
        }

        tmp = 0;

        // 대각선인지 확인
        // 우하향 대각선
        if (X == Y) {
            for (int i = 0; i < 5; i++) {
                if (bingo[i][i] == 0) {
                    tmp++;
                }
            }
            if (tmp == 5) {
                count++;
            }
        }
        tmp = 0;

        // 좌하향 대각선
        if (X + Y == 4) {
            for (int i = 0; i < 5; i++) {
                if (bingo[i][4 - i] == 0) {
                    tmp++;
                }
            }
            if (tmp == 5) {
                count++;
            }
        }
        return count;
    }
}
