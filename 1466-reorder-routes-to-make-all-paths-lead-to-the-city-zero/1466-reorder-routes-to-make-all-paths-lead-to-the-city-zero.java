class Solution {
    public int minReorder(int n, int[][] connections) {
        // 그래프를 인접 리스트로 표현
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // 양방향 그래프 만들기
        for (int[] conn : connections) {
            int from = conn[0];
            int to = conn[1];
            
            graph.get(from).add(new int[]{to, 1}); // 정뱡향: 주어진 간선 방향 그대로 from -> to
            graph.get(to).add(new int[]{from, 0}); // 역방향: to -> from
        }
        /**
        * 예제 connections = [[0,1],[1,3],[2,3],[4,0],[4,5]]
        * 
        * graph = [
            [[1, 1], [4, 0]], // 0번 노드는 1을 바라보고 있고(정방향), 4번 노드가 1번 노드를 바라보고 있음(역방향)
            [[0, 0], [3, 1]],
            [[3, 1]],
            [[1, 0], [2, 0]],
            [[0, 1], [5, 1]],
            [[4, 0]]
        ]
        */

        // for (int i = 0; i < graph.size(); i++) {
        //     System.out.print("Node " + i);
        //     for (int[] edge : graph.get(i)) {
        //         int to = edge[0];
        //         int direction = edge[1];
        //         // System.out.print("-> " + to + " (Direction: " + direction + ") ");
        //         System.out.print(" to: " + to + " " + "from: " + direction);
        //     }
        //     System.out.println("");
        // }

        // DFS 탐색
        // 부모노드 인자를 -1로 넣은건 시작노드로 넣은 0은 부모노드가 없음을 나타낼려고
        return dfs(0, -1, graph);
    }

    private int dfs(int node, int parent, List<List<int[]>> graph) {
        int changeCount = 0;

        // 현재 노드의 자식 노드 탐색
        for (int[] tmp : graph.get(node)) {
            int nextNode = tmp[0];
            int direction = tmp[1]; // 1: 정방향(node가 nextNode를 바라봄), 0: 역방향(nextNode가 node를 바라봄)

            // nextNode가 부모노드이면 이미 검사를 했으므로 pass
            if (nextNode != parent) {
                changeCount += direction; // [자식노드, 0]: 자식노드가 부모노드를 바라봄, [자식노드, 1]: 부모노드가 자식노드를 바라봄 -> 부모노드는 자식 노드를 바라보면 안됨. 0 <- 1 <- 2... 이 옳바른 방향이므로 output += direction  
                changeCount += dfs(nextNode, node, graph);
            }
        }

        return changeCount;
    }
}