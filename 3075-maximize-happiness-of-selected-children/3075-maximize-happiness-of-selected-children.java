class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long output = 0L;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < happiness.length; i++) list.add(happiness[i]);
        list.sort(Comparator.reverseOrder());

        int num = 0;

        for (int i = 0; i < k; i++) {
            // 0 보다 커야함
            output += Math.max(list.get(i) - num, 0);
            num++;
        }
        
        return output;
    }
}