import sys
from collections import deque

input = sys.stdin.readline
que = deque()


X, Y = map(int, input().split())
map_list = [list(input()) for _ in range(X)]
# time[x][y][벽을 뚫었는지 여부(0이면 안 뚫은거, 1이면 뚫은 거)] = 여기까지 걸린 시간
time = [[[0] * 2 for _ in range(Y)] for _ in range(X)]

# 상하좌우
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

def bfs():
    while que:
        x, y, wall = que.popleft()
        if x == (X - 1) and y == (Y - 1):
            return
        for i in range(4):
            move_x = x + dx[i]
            move_y = y + dy[i]

            if (0 <= move_x < X) and (0 <= move_y < Y):
                # 길일 때
                if map_list[move_x][move_y] == '0' and time[move_x][move_y][wall] == 0:
                    time[move_x][move_y][wall] = time[x][y][wall] + 1
                    que.append((move_x, move_y, wall))

                # 벽을 마주했는데 아직 하나도 부시지 않았을 경우
                if wall == 0 and map_list[move_x][move_y] == '1' and time[move_x][move_y][wall] == 0:
                    time[move_x][move_y][1] = time[x][y][0] + 1
                    que.append((move_x, move_y, 1))


que.append((0, 0, 0))
time[0][0][0] = 1
bfs()


# 출력
ans = max(time[X - 1][Y - 1][0], time[X - 1][Y - 1][1])
if ans == 0:
    print(-1)
else:
    print(ans)

