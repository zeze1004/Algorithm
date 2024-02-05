import java.util.Scanner;

public class B16194 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        int[] p = new int[n+1];
        for (int i = 1; i <= n; i++) {
            int tmp = sc.nextInt();
            dp[i] = tmp;
            p[i-1] = tmp;

            for (int j = 1; j < i; j++) {
                dp[i] = Math.min(dp[i], dp[j] + p[i-1-j]);
            }
        }
        System.out.println(dp[n]);
    }
}
