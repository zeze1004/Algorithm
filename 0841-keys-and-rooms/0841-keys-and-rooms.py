class Solution:
    def canVisitAllRooms(self, rooms: List[List[int]]) -> bool:
        output = 0
        visited = [False] * len(rooms)
        self.dfs(rooms, visited, 0)
        
        for i in range(len(visited)):
            if visited[i] is False:
                return False
        
        return True

    def dfs(self, rooms, visited, key):
        print(key)
        if visited[key] is True:
            return
        visited[key] = True

        for i in range(len(rooms[key])):
            if visited[rooms[key][i]] is False:
                self.dfs(rooms, visited, rooms[key][i]) 
    
        