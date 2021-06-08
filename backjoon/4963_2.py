import sys
sys.setrecursionlimit(3000)

input = sys.stdin.readline

# 상하좌우 + 대각선
dx = [0, 0, -1, 1, -1, -1, 1, 1]
dy = [1, -1, 0, 0, -1, 1, -1, 1]

def dfs(y, x):
    for i in range(8):
        move_x = x + dx[i]
        move_y = y + dy[i]

        if (0 <= move_x < garo) and (0 <= move_y < sero):
            if land_map[move_y][move_x] == 1 and visited[move_y][move_x] == 0:
                land_map[move_y][move_x] = 0
                visited[move_y][move_x] = 1
                dfs(move_y, move_x)



while True:
    count = 0
    garo, sero = map(int, input().split())
    if garo == 0 and sero == 0:
        exit(0)
    land_map = [list(map(int, input().split())) for _ in range(sero)]
    visited = [[0] * garo for _ in range(sero)]
    # print(land_map)
    for i in range(sero):
        for j in range(garo):
            if land_map[i][j] == 1:
                count += 1
                dfs(i, j)
    print(count)
