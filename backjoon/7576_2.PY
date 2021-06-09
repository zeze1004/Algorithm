import sys
from collections import deque

input = sys.stdin.readline

X, Y = map(int, input().split())
que = deque()

tomato_map = [list(map(int, input().split())) for _ in range(Y)]
# 안 익은 토마토가 익은 시간을 저장할 리스트
# 하지만 쓸모 없었다😢
time = [[0] * X for _ in range(Y)]

# 상하좌우
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

def bfs():
    count = 0
    while que:
        count += 1
        # 큐의 길이(익은 토마토 갯수)만큼 익은 토마토 주의를 탐색하지 않으면 0이 나오지 않을 때까지
        # 끝도 없이 탐색해서 count 수가 슉슉 증가함😢
        # 큐의 길이만큼 탐색해야 1의 상하좌우만 탐색할 수 있음
        for _ in range(len(que)):
            y, x = que.popleft()
            for i in range(4):
                move_x = x + dx[i]
                move_y = y + dy[i]

                if (0 <= move_x < X) and (0 <= move_y < Y):
                    if tomato_map[move_y][move_x] == 0 and time[move_y][move_x] == 0:
                        tomato_map[move_y][move_x] = 1
                        time[move_y][move_x] = time[y][x] + 1
                        que.append((move_y, move_x))
    # 처음 익은 토마토까지 1로 카운팅 돼서 하나 빼줘야 함
    return count - 1

for i in range(Y):
    for j in range(X):
        if tomato_map[i][j] == 1 and time[i][j] == 0:
            que.append((i, j))

result = bfs()

# 출력
# 하나로 안 익은 토마토가 있으면 -1 출력하고 끝내기
for i in range(Y):
    for j in range(X):
       if tomato_map[i][j] == 0: 
           print(-1)
           exit(0)

print(result)



