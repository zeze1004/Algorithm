class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int passinger = 0, start = 1, end = 2;
        int tmpCapacity = capacity;
        int[] load = new int[1001]; 
        int idx = 0;

        for (int[] trip : trips) {
            load[trip[start]] += trip[passinger];
            load[trip[end]] -= trip[passinger];
        }

        for (Integer l : load) {
            if (capacity < 0) return false;
            capacity -= l;
            idx++; 
        }

        // for (Integer i : load) System.out.printf("%d ", i);

        return true;    
    }
}