import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11053 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[num];
        int[] dp = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < num; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {       // (j < i) arr[i]의 앞전 배열값을 순회 비교
                if (arr[j] < arr[i]) {          // j 배열 값이 더 작다면 증가 수열으로 판단
                    if (dp[j] + 1 > dp[i]) {   // 증가 수열의 갯수가 작다면 이전 증가 수열 개수에서 하나 추가
                        dp[i] = dp[j] + 1;
                    }
                }
            }
        }

        int count = 0;
        for (int i : dp) {
            count = Math.max(i, count);
        }

        System.out.println(count);
    }
}
