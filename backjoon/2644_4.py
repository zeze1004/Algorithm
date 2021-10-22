from typing import DefaultDict


from collections import defaultdict

family_num = int(input())
start, last = map(int, input().split())
link_num = int(input())
visited = [-1] * (family_num + 1)


link = defaultdict(list)

for _ in range(link_num):
    a, b = map(int, input().split())
    link[a].append(b)
    link[b].append(a)

def dfs(node):
    if node == last:
        print(visited[last])
        exit(0)
    
    for i in link[node]:
        if visited[i] == -1:
            visited[i] = visited[node] + 1
            dfs(i)


visited[start] += 1
dfs(start)
print(-1)