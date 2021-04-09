# 입력이 2500이상이므로 재귀 깊이 제한
from sys import setrecursionlimit
setrecursionlimit(3000)

# 좌표 리스트
map_x = [1, -1, 0, 0]
map_y = [0, 0, 1, -1]


def dfs(x, y):
    # 상하좌우 탐색
    for i in range(4):
        move_x = x + map_x[i]
        move_y = y + map_y[i]
        # 정해진 input_map에서 벗어나지 않을 시
        if (0 <= move_x < garo) and (0 <= move_y < sero):
            # 배추가 있다면 0으로 초기화하고 해당 구간에서 부터 다시 탐색
            if input_map[move_x][move_y] == 1:
                input_map[move_x][move_y] = 0
                dfs(move_x, move_y)


testcase = int(input())
for i in range(testcase):
    count = 0
    garo, sero, bachu_num = map(int, input().split())
    # 입력 받은 땅 list를 0으로 초기화
    input_map = [[0]*sero for _ in range(garo)]
    # 배추가 심어진 곳 입력 받음
    for j in range(bachu_num):
        garo_bachu, sero_bachu = map(int, input().split())
        input_map[garo_bachu][sero_bachu] = 1
        # dfs를 통해 인접한 배추 있는 지 확인
    for x in range(garo):
        for y in range(sero):
            # 배추가 있다면 인접 구역을 탐색한다
            if input_map[x][y] == 1:
                # dfs를 실행하는 횟수만 구하면 됨
                count += 1
                dfs(x, y)
    print(count)
