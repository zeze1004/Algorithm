import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11722 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] dp = new int[num];
        int[] arr = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr[i] = (Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < num; i++) {         // 첨부터 끝까지 배열 하나씩 값 비교
            dp[i] = 1;
            for (int j = 0; j < i; j++) {       // 배열 처음부터 i - 1번까지 비교
                if (arr[j] > arr[i]) {          // i 인덱스의 값을 0부터 i-1 인덱스까지 값 비교하여, i 인덱스보다 큰 값이 있으면 감소수열로 판단(j는 i보다 무조건 작음)
                    if (dp[j] + 1 >= dp[i]) {   // dp[i]에 감소 수열 갯수가 더 크다면, 해당 감소 수열은 최장이 아니므로 pass
                        dp[i] = dp[j] + 1;      // 더 작다면 이전의 최장 감소수열에서 길이 갯수가 추가되므로 이전 수에서 1 추가
                    }
                }
            }
        }
        int count = 0;
        for (int i : dp) {
            count = Math.max(count, i);
        }
        System.out.println(count);
    }
}
