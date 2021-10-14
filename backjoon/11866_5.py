import sys
from collections import deque

input = sys.stdin.readline

n, k = map(int, input().split())
que = deque()
output = []
for i in range(1, n + 1):
    que.append(i)

while que:
    que.rotate(-k + 1)
    output.append(str(que.popleft()))

print('<', ', '.join(output), '>', sep='')

