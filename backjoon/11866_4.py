import sys
from collections import deque

input = sys.stdin.readline

num, k = map(int, input().split())
que = deque()
result = []

for i in range(1, num + 1):
    que.append(i)

while que:
    que.rotate(-k + 1)
    result.append(str(que.popleft()))

print('<', ', '.join(result), '>', sep='')