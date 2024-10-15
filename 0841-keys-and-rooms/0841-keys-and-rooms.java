class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] isVisited = new boolean[rooms.size()];
        // 첫 번째 방부터 탐색
        dfs(rooms, isVisited, 0);
            
        for (int i = 0; i < isVisited.length; i++) {
            if (isVisited[i] == false) return false;
        }

        return true;
    }

    public void dfs(List<List<Integer>> rooms, boolean[] isVisited, int idx) {
        if (isVisited[idx]) return;
        else isVisited[idx] = true;

        for (int key : rooms.get(idx)) {
            if (isVisited[key] == false) {
                dfs(rooms, isVisited, key);
            }
        }    
    }
} 