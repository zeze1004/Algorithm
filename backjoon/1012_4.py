import sys
from collections import deque

input = sys.stdin.readline

test_num = int(input())

# 상하좌우
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

def bfs():
    while que:
        x, y = que.popleft()
        for i in range(4):
            move_x = x + dx[i]
            move_y = y + dy[i]

            if (0 <= move_x < X) and (0 <= move_y < Y):
                if bachu_map[move_x][move_y] == 1:
                    bachu_map[move_x][move_y] = 0
                    que.append((move_x, move_y))

for _ in range(test_num):
    count = 0
    que = deque()
    X, Y, bachu = map(int, input().split())
    bachu_map = [[0] * Y for _ in range(X)]
    for _ in range(bachu):
        x, y = map(int, input().split())
        bachu_map[x][y] = 1
    for i in range(X):
        for j in range(Y):
            if bachu_map[i][j] == 1:
                bachu_map[i][j] = 0
                count += 1
                que.append((i, j))
                bfs()    

    print(count)