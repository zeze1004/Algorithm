import sys

input = sys.stdin.readline
sys.setrecursionlimit(3000)


# 상하좌우 + 대각선
dx = [0, 0, -1, 1, 1, -1, 1, -1]
dy = [1, -1, 0, 0, 1, 1, -1, -1]

def dfs(y, x):
    for i in range(8):
        move_x = x + dx[i]
        move_y = y + dy[i]

        if (0 <= move_x < X) and (0 <= move_y < Y):
            if (visited[move_y][move_x] == 0) and (land_map[move_y][move_x] == 1):
                visited[move_y][move_x] = 1
                land_map[move_y][move_x] = 0
                dfs(move_y, move_x)


while True:
    count = 0
    X, Y = map(int, input().split())
    if X == 0 and Y == 0:
        exit(0)
    land_map = [list(map(int, input().split())) for _ in range(Y)]
    visited = [[0] * X for _ in range(Y)]
    
    for y in range(Y):
        for x in range(X):
            if land_map[y][x] == 1:
                count += 1
                visited[y][x] = 1
                land_map[y][x] = 0
                dfs(y, x)
    
    print(count)