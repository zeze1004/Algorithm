class Solution {
    int output = 0;
    public int minReorder(int n, int[][] connections) {
        List<List<int[]>> connectionList = new ArrayList<>();
        boolean[] isVisited = new boolean[n];

        for (int i = 0; i < n; i++) {
            connectionList.add(new ArrayList<>());
        }

        for (int tmp[] : connections) {
            int parentCity = tmp[1];
            int childCity = tmp[0];

            connectionList.get(parentCity).add(new int[]{childCity, 0}); // 정방향
            connectionList.get(childCity).add(new int[]{parentCity, 1}); // 역방향
        }

        dfs(connectionList, isVisited, -1, 0);

        return output;
    }

    private void dfs(List<List<int[]>> connectionList, boolean[] isVisited, int parentNode, int currNode) {
        // 종료 조건
        if (isVisited[currNode]) {
            return;
        }

        List<int[]> nodeList = new ArrayList<>();
        nodeList = connectionList.get(currNode);

        for (int[] node : nodeList) {
            int nextNode = node[0];
            int direction = node[1]; // 0이면 currNode -> nextNode, 1이면 nextNode -> currNode

            if (nextNode != parentNode) {
                output += direction;
                dfs(connectionList, isVisited, currNode, nextNode);
            }
        }
    }
}
