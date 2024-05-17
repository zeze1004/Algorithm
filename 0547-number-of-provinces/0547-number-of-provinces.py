class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        visited = [False] * len(isConnected)
        output = 0

        def dfs(city):
            if visited[city]:
                return
            visited[city] = True

            for c in range(len(isConnected)):
                if isConnected[city][c] == 1:
                    dfs(c)
        
        for i in range(len(isConnected)):
            if visited[i] == False:
                output += 1
                dfs(i)
        
        return output
