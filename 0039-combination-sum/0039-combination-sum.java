class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(candidates, target, output, new ArrayList<>(), 0);

        return output;
    }

    private void backtracking(int[] candidates, int target, List<List<Integer>> output, List<Integer> current, int idx) {
        if (target == 0) {
            output.add(new ArrayList<>(current)); // 깊은복사
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            if (target < candidates[i]) return;
            current.add(candidates[i]);
            backtracking(candidates, target - candidates[i], output, current, i);
            current.remove(current.size() - 1);
        }
    }
}