import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B2167 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] nums = new int[N][M];

        int num;
        // 이중 배열에 값 넣기
        for (int i = 0; i < N; i++) {
            int tmp = 0;
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
                nums[i][tmp++] = num;
            }

        }

        List<Integer> resList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());

        // 합을 구한 배열의 위치 넣기
        // (i, j) => (x, y)
        // 1. j++ == y가 될 때까지 nums[i][j] 더하기
        // 2. i++ == x가 될 때까지 nums[i][j] 더하기
        for (int itex = 0; itex < K; itex++) {
            int res = 0;
            st = new StringTokenizer(br.readLine());

            int startRow = Integer.parseInt(st.nextToken()) - 1;
            int startCol = Integer.parseInt(st.nextToken()) - 1;
            int endRow = Integer.parseInt(st.nextToken());
            int endCol = Integer.parseInt(st.nextToken());

            for (int i = startRow; i < endRow; i++) {
                for (int j = startCol; j < endCol; j++) {
                    res += nums[i][j];
                }
            }
            resList.add(res);
        }

        for (Integer i : resList) {
            System.out.println(i);
        }
    }
}
