class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList<>(); 
        Arrays.sort(candidates);
        backtrack(output, new ArrayList<Integer>(), candidates, target, 0);

        return output;
    }

    private void backtrack(List<List<Integer>> output, List<Integer> tmp, int[] candidates, int target, int idx) {
        if (target == 0) {
            output.add(new ArrayList<>(tmp)); // 깊은 복사
            return;
        }

        // 재귀
        for (int i = idx; i < candidates.length; i++) {
            if (target < candidates[i]) return; // 가지치기: 개별 원소가 target 보다 크면 값이 될 수 없기에 종료

            tmp.add(candidates[i]);
            backtrack(output, tmp, candidates, target - candidates[i], i); // 같은 숫자 중복 사용 가능하므로 동일한 idx 전달
            tmp.remove(tmp.size() - 1); // 백트래킹(마지막으로 추가한 요소 제거)
        }
    }
}