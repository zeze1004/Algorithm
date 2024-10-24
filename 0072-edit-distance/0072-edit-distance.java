class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word2.length() + 1][word1.length() + 1];

        int x = 0, y = 0;
        for (int i = 0; i < word2.length() + 1; i++) {
            dp[i][0] = x++;
        }
        for (int i = 0; i < word1.length() + 1; i++) {
            dp[0][i] = y++;
        }

        for (int i = 1; i < word2.length() + 1; i++) {
            for (int j = 1; j < word1.length() + 1; j++) {
                if (word2.charAt(i - 1) == word1.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // 글자가 같으면, 배열의 좌상향 값을 그대로 사용
                                                 // 좌상향 값은 이전 글자의 마지막 갱신값 
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j])) + 1;
                }
            }
        }

        return dp[word2.length()][word1.length()];
    }
}