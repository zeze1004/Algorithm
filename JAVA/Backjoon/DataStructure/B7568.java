import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B7568 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[][] bodyList = new int[2][num];
        List<Integer> rank = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            bodyList[0][i] = Integer.parseInt(st.nextToken());
            bodyList[1][i] = Integer.parseInt(st.nextToken());
        }

        // 덩치 비교: 몸무게와 키 모두 큰 비교 상대가 나타나면 랭킹 1씩 증가
        for (int i = 0; i < num; i++) {
            int ranking = 1;

            for (int j = 0; j < num; j++) {
                // 몸무게와 키 모두 커야 랭크가 높음
                if (bodyList[0][i] < bodyList[0][j] && bodyList[1][i] < bodyList[1][j]) {
                    ranking++;
                }
            }
            rank.add(ranking);
        }

        for (Integer i : rank) {
            System.out.print(i + " ");
        }
    }
}
