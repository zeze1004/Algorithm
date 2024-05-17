class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;
        dfs(rooms, visited, 0);
        
        for (boolean b : visited) {
            if (!b) return false;
        }
        return true;
    }

    public void dfs(List<List<Integer>> rooms, boolean[] visited, int roomNum) {
        List<Integer> keys = rooms.get(roomNum);
        for (int i = 0; i < keys.size(); i++) {
            int key = (int) keys.get(i);
            if (!visited[key]) {
                visited[key] = true;
                dfs(rooms, visited, key);
            }
        }
    }

}