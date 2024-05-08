class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> map = new HashMap<>();
        String[] output = new String[score.length];
        int[] tmp = score.clone();
        Arrays.sort(tmp);

        for (int i = 0; i < tmp.length; i++) {
            map.put(tmp[i], tmp.length - i); // key: score, value: rank
        }

        for (int i = 0; i < score.length; i++) {
            int rank = map.get(score[i]);

            if (rank == 1)
                output[i] = "Gold Medal";
            else if (rank == 2)
                output[i] = "Silver Medal";
            else if (rank == 3)
                output[i] = "Bronze Medal";
            else
                output[i] = String.valueOf(rank);
        }

        return output;
    }
}