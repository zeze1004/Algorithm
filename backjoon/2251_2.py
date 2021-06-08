import sys
from collections import deque

input = sys.stdin.readline

que = deque()
answer = []

A, B, C = map(int, input().split())

# C 물통의 물양은 A, B에 의해 정해지므로 A, B에서 이동하는 경우만 표시
visited = [[0] * (B + 1) for _ in range(A + 1)]


def pour(a, b):
    if visited[a][b] == 0:
        visited[a][b] = 1
        que.append((a, b))

def bfs():
    # A, B 물통은 물의 양 0부터 시작하므로
    que.append((0, 0))
    visited[0][0] = 1
    while que:
        a, b = que.popleft()
        c = C - (a + b)
        if a == 0:
            answer.append(c)
        
        # a -> b
        if a > 0 and b < B:
            water = min(a, B - b)
            pour(a - water, b + water)
        
        # a -> c
        if a > 0 and c < C:
            water = min(a, C - c)
            pour(a - water, b)
        
        # b -> a
        if b > 0 and a < A:
            water = min(b, A - a)
            pour(a + water, b - water)

        # b -> c
        if b > 0 and c < C:
            water = min(b, C - c)
            pour(a, b - water)
        
        # c -> a
        if c > 0 and a < A:
            water = min(c, A - a)
            pour(a + water, b)
        
        # c -> b
        if c > 0 and b < B:
            water = min(c, B - b)
            pour(a, b + water)

bfs()

answer.sort()
print(' '.join(list(map(str, answer))))