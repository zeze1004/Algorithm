import sys
# sys.setrecursionlimit(100001)

input = sys.stdin.readline

all_num = int(input())
familly_list = [[] for _ in range(all_num + 1)]
visited = [-1] * (all_num + 1)

start, goal = map(int, input().split())
node_num = int(input())

def dfs(node):
    if node == goal:
        print(visited[goal])
        exit(0)
    
    for i in familly_list[node]:
        if visited[i] == -1:
            visited[i] = visited[node] + 1
            dfs(i)
        

for _ in range(node_num):
    x, y = map(int, input().split())
    familly_list[x].append(y)
    familly_list[y].append(x)
  
visited[start] += 1
dfs(start)
print(-1)