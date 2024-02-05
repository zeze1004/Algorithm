import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11055 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        int[] dp = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < num; i++) {
            dp[i] = arr[i];
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[j] + arr[i], dp[i]);
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
