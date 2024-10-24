class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> output = new ArrayList<>();
        backtracking(output, new ArrayList<Integer>(), k, n, 0, 1);

        return output;
    }

    private void backtracking(List<List<Integer>> output, List<Integer> tmp, int k, int n, int sum, int index) {
        if (tmp.size() > k || sum > n || index > 9) return;
        if (tmp.size() == k && sum == n) {
            output.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = index; i < 10; i++) {
            tmp.add(i);
            sum += i;
            backtracking(output, tmp, k, n, sum, i + 1);
            tmp.remove(tmp.size() - 1);
            sum -= i;
        }
    }
}