class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int len = asteroids.length, idx = 0;

        for (int i = 0; i < len; i++) {
            int compare = asteroids[i];
            while (idx > 0 && asteroids[idx - 1] > 0 && compare < 0 && asteroids[idx - 1] < -compare) idx--;
            
            if (idx == 0 || compare > 0 || asteroids[idx - 1] < 0) {
                asteroids[idx++] = compare;
            } else if (asteroids[idx - 1] == -compare) {
                idx--;
            }
        }

        int[] output = new int[idx];
        int start = 0, end = idx;
        System.arraycopy(asteroids, start, output, start, end);

        return output;
    }
}