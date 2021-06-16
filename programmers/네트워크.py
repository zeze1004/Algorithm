def dfs(computers, visited, index):
    for i in range(len(computers)):
        if computers[index][i] == 1 and visited[i] == 0:
            visited[i] = 1
            dfs(computers, visited, i)

def solution(n, computers):
    visited = [0] * n
    ans = 0
    while 0 in visited:
        for i in range(n):
            if visited[i] == 0:
                visited[i] = 1
                dfs(computers, visited, i)
                ans += 1
    return ans