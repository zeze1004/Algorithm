class Solution {
    public int climbStairs(int n) {
        int[] stairs = new int[n];
        stairs[0] = 1;
        stairs[1] = 2;

        for (int i = 2; i < n; i++) {
            stairs[i] = stairs[i - 2] + stairs[i - 1];
            // System.out.println(stairs[i]);
        }

        return stairs[n - 1];
    }
}