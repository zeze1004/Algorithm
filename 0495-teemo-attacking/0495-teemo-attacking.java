class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int output = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            if (i + 1 < timeSeries.length && timeSeries[i + 1] < timeSeries[i] + duration) {
                output += timeSeries[i + 1] - timeSeries[i];
            } else {
                output += duration;
            }
        }

        return output;
    }
}