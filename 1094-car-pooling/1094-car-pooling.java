class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int currentPassingerNum[] = new int[1001];
        int passingerNum = 0, start = 1, end = 2;

        for (int trip[] : trips) {
            currentPassingerNum[trip[start]] += trip[passingerNum];
            currentPassingerNum[trip[end]] -= trip[passingerNum];
        }

        // for (int n : currentPassingerNum) System.out.printf("%d ", n);

        for (int i = 0; i < 1001; i++) {
            if (capacity < 0) return false;
            capacity -= currentPassingerNum[i];
            // System.out.printf("capacity: %d, currentN: %d\n", capacity, currentPassingerNum[i]);
        }

        return true;
    }
}