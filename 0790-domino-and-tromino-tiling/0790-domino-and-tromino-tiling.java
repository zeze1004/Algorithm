class Solution {
    public int numTilings(int n) {
        long[] dp = new long[1000];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;

        for (int i = 4; i < 1000; i++) {
            dp[i] = (2 * dp[i - 1] + dp[i - 3]) % 1000000007; // n이 커지면 long 범위도 넘어가서 오버플로우를 막도록 2^31 수에 근접한 소수로 나머지 계산하면, 정수 범위를 넘지 않음 
        }

        return (int)dp[n];
    }
}