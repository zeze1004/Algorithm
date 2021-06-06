import sys
from sys import setrecursionlimit
from collections import deque

setrecursionlimit(3000)

input = sys.stdin.readline

input = sys.stdin.readline

garo, sero = map(int, input().split())
count = 0
tomato = []

# 상하좌우
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

def bfs(y, x):
    global count
    for i in range(4):
        move_x = x + dx[i]
        move_y = y + dy[i]

        if (0 <= move_x < garo) and (0 <= move_y < sero) and tomato[move_y][move_x] == 0:
            tomato[move_y][move_x] = 2
            # count = count + 1
            bfs(move_y, move_x)
        elif (0 <= move_x < garo) and (0 <= move_y < sero) and tomato[move_y][move_x] == -1:
            return



for i in range(sero):
    tomato.append(list(map(int, input().split())))

for y in range(sero):
    for x in range(garo):
        if tomato[y][x] == 1:
            count = count + 1
            bfs(y, x)



print(count)


