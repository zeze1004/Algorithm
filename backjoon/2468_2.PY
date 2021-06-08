import sys
sys.setrecursionlimit(10000)

input = sys.stdin.readline

num = int(input())

map_list = [list(map(int, input().split())) for _ in range(num)]

count_list = []

dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

def dfs(water_level, x, y):
    for i in range(4):
        move_x = x + dx[i]
        move_y = y + dy[i]

        if (0 <= move_x < num) and (0 <= move_y < num):
            if map_list[move_x][move_y] > water_level and visited[move_x][move_y] == 0:
                visited[move_x][move_y] = 1

                dfs(water_level, move_x, move_y)

ans = 1
for water_level in range(1, 101):
    count = 0
    visited = [[0] * num for _ in range(num)]
    for x in range(num):
        for y in range(num):
            if map_list[x][y] > water_level and visited[x][y] == 0:
                visited[x][y] = 1
                count += 1
                dfs(water_level, x, y)
    ans = max(count, ans)


print(ans)           
    


        