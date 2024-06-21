class Solution {
    int closestCost;
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        closestCost = Integer.MAX_VALUE;

        for (int baseCost : baseCosts) {
            dfs(toppingCosts, 0, baseCost, target);
        }

        return closestCost;
    }

    private void dfs(int[] toppingCosts, int index, int currentCost, int target) {
        // 현재 비용이 목표와 가장 가까운지 확인
        if (Math.abs(currentCost - target) < Math.abs(closestCost - target) ||
            (Math.abs(currentCost - target) == Math.abs(closestCost - target) &&
            currentCost < closestCost)) {
                closestCost = currentCost;
        }

        // 모든 토핑을 다 사용했으면 탐색 종료
        if (index >= toppingCosts.length || currentCost >= target) {
            return;
        }

        // 각 토핑을 0, 1, 2번 추가하는 경우에 대해 DFS 호출
        dfs(toppingCosts, index + 1, currentCost, target);
        dfs(toppingCosts, index + 1, currentCost + toppingCosts[index], target);
        dfs(toppingCosts, index + 1, currentCost + toppingCosts[index] * 2, target);
    }
}