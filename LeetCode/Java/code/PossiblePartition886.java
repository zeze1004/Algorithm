import java.util.ArrayList;
import java.util.List;

class PossibleBipartition886 {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        // 이분그래프 문제
        // 그래프 문제를 풀기 위해서는 DFS, BFS 중 하나 선택 필요

        // 인접리스트로 구현
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < N; i++) { // 인접리스트 초기화
            adjList.add(new ArrayList<>());
        }

        boolean[] visited = new boolean[N];
        boolean[] color = new boolean[N];

        for(int[] person : dislikes) { // 인접리스트에 값 넣어주기
            int first = person[0] - 1;
            int second = person[1] - 1;
            adjList.get(first).add(second);
            adjList.get(second).add(first);
        }

        for(int i = 0; i < N; i++) {
            System.out.println(i + ":");
            for(int cur: adjList.get(i)) {
                System.out.println(cur);
            }
            System.out.println("----");
        }

        // 그래프 탐색
        for(int i = 0; i < N; i++) {
            if(!visited[i]) { // 아직 방문하지 않았으면 dfs 함수로 전달하여 탐색
                visited[i] = true;
                boolean res = isBipartiteDfs(i, adjList, visited, color);
                if(!res) return false;
            }
        }
        return true;
    }

    private boolean isBipartiteDfs(int cur, List<List<Integer>> adjList,
                                   boolean[] visited, boolean[] color) {
        for(int next: adjList.get(cur)) {
            if(!visited[next]) { // 다음 노드를 아직 방문하지 않았다면
                visited[next] = true; // 방문처리
                color[next] = !color[cur]; // 최상단 노드와 next 노드는 서로 싫어함으로 상반된 coler(true/false) 표현
                boolean res = isBipartiteDfs(next, adjList, visited, color); // next 최상단 노드도 탐색
                if(!res) return false;
            } else if(color[cur] == color[next]) {  // 방문했다면 현재 노드와 방문한 노드와 색깔이 같은지, 틀린지 확인 필요
                return false;                       // 같은 색깔이면 그룹을 나눌 수 없으니 false
            }
        }
        return true; // 방문처리 됐고, 서로 색깔도 다른거 확인
    }
}
