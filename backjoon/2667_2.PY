import sys
from collections import deque

input = sys.stdin.readline

num = int(input())
apartment = [list(input()) for _ in range(num)]

que = deque()
count_list = []

# 상하좌우
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

def bfs():
    count = 0
    while que:
        count += 1
        x, y = que.popleft()
        for i in range(4):
            move_x = x + dx[i]
            move_y = y + dy[i]

            if (0 <= move_x < num) and (0 <= move_y < num):
                if apartment[move_x][move_y] == '1':
                    apartment[move_x][move_y] = '0'
                    que.append((move_x, move_y))
    count_list.append(count)

count = 0
for i in range(num):
    for j in range(num):
        if apartment[i][j] == '1':
            apartment[i][j] = '0'
            que.append((i, j))
            count += 1
            bfs()
            
count_list.sort()
print(count)
for i in count_list:
    print(i)