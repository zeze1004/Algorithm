class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), n, k, 1);

        return result;
    }

    public void backtrack(List<List<Integer>> result, List<Integer> current, int n, int k, int start) {
        // 재귀함수 종료 조건: 조합의 길이가 k개가 되면 조합을 result에 넣고 종료
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {
            current.add(i);
            // start 인자에 i + 1을 넘겨 중복되는 수를 탐색하지 않도록 함
            backtrack(result, current, n, k, i + 1);
            // current의 마지막 값을 제거해 다른 수와 조합이 가능한지 탐색하도록 함
            // ex. current = [1, 2]가 있는 상태에서 마지막 수를 삭제하면, current = [1]이 되고 3을 넣을 수 있게 됨
            current.remove(current.size() - 1);
        }
    }
}
