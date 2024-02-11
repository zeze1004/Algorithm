public class P43105 {
    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        solution(triangle);
    }


    public static int solution(int[][] triangle) {
        int answer = 0;
        int len = triangle.length;
        int[][] dp = new int[len][len];
        dp[0][0] = triangle[0][0];

        for (int i = 1; i < triangle.length; i++) {
            // 맨 왼쪽 배열 누적합
            dp[i][0] = dp[i - 1][0] + triangle[i][0];

            // 맨 오른쪽 배열 누적합
            dp[i][i] = dp[i - 1][i - 1] + triangle[i][i];

            // 맨 왼쪽과 오른쪽을 제외한 배열들 중 최대합 저장
            for (int j = 1; j <= i - 1; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j]; // 왼쪽 대각선 위 숫자와 바로 위 숫자와 중에 더 큰 수와 더함
            }
        }

        // 누적합이 계속 쌓인 마지막 배열 중에서 가장 큰 값을 고름
        for (int j = 1; j < len; j++) {
            answer = Math.max(dp[len - 1][j - 1], answer);
        }

        return answer;
    }
}
