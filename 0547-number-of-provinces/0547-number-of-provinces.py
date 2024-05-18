class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        visited = [False] * len(isConnected)
        output = 0
        for i in range(len(isConnected)):
            if not visited[i]:
                output += 1
                self.dfs(isConnected, visited, i)
        
        return output

    def dfs(self, isConnected: List[List[int]], visited: List[bool], city: int):
        visited[city] = True
        for i in range(len(isConnected[city])):
            if isConnected[city][i] == 1 and not visited[i]:
                self.dfs(isConnected, visited, i)