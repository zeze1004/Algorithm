import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B15649 {

    public static int[] ansArr;
    public static boolean[] visit;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ansArr = new int[M];
        visit = new boolean[N];

        dfs(N, M, 0);
    }

    public static void dfs(int n, int m, int depth) {
        System.out.println("dfs 시작! depth: " + depth);
        if (depth == m) {
            // for (int ans : ansArr) {
            //     System.out.println(ans + " ");
            // }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                ansArr[depth] = i + 1;
                System.out.println("새로운 dfs가 호출되기 전, depth = " + (depth + 1));
                dfs(n, m, depth + 1);

                System.out.println("이전 dfs가 끝나고, depth = " + depth);
                System.out.println(i);
                visit[i] = false;
            }
        }
    }
}
