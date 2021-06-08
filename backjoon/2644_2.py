import sys
sys.setrecursionlimit(10000)

input = sys.stdin.readline

familly_num = int(input())
familly_list = [[] for _ in range(familly_num + 1)]
visited = [0] * (familly_num + 1) 
start, goal = map(int, input().split())
connection_num = int(input())


def dfs(member):
    if member == goal:
        return
    for i in familly_list[member]:
        if visited[i] == 0:
            visited[i] = visited[member] + 1
            dfs(i)




for _ in range(connection_num):
    a, b = map(int, input().split())
    familly_list[a].append(b)
    familly_list[b].append(a)

dfs(start)

# 출력
if visited[goal] != 0:
    print(visited[goal])
else:
    print(-1)