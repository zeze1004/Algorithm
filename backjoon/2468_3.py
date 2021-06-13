import sys
sys.setrecursionlimit(10001)

input = sys.stdin.readline

num = int(input())
map_list = [list(map(int, input().split())) for _ in range(num)]

# 상하좌우
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

def dfs(x, y, water):
    for i in range(4):
        move_x = x + dx[i]
        move_y = y + dy[i]

        if (0 <= move_x < num) and (0 <= move_y < num):
            if visited[move_x][move_y] == 0 and map_list[move_x][move_y] > water:
                    visited[move_x][move_y] = 1
                    dfs(move_x, move_y, water)

ans = 1
for water in range(1, 101):
    visited = [[0] * num for _ in range(num)]
    count = 0
    for x in range(num):
        for y in range(num):
            if map_list[x][y] > water and visited[x][y] == 0:
                visited[x][y] = 1
                count += 1
                dfs(x, y, water)
    ans = max(ans, count)


print(ans)
                
