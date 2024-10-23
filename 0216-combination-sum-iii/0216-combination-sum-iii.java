class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> output = new ArrayList<>();
        backtracking(output, new ArrayList<Integer>(), k, n, 1, 0);

        return output;
    }

    private void backtracking(List<List<Integer>> output, List<Integer> tmp, int k, int n, int index, int sum) {
        if (tmp.size() > k || sum > n || (tmp.size() == k && sum != n)) return;
        if (tmp.size() == k && sum == n) {
            output.add(new ArrayList<>(tmp));
            return;
        }
        
        for (int i = index; i < 10; i++) {
            if (tmp.contains(i)) continue;
            tmp.add(i);
            
            backtracking(output, tmp, k, n, i + 1, sum + i);
            
            if (!tmp.isEmpty()) {
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}