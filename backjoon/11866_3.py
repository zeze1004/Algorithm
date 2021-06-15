from os import rename
import sys
from collections import deque

input = sys.stdin.readline

num, sequence = map(int, input().split())
que = deque()
result = []

for i in range(1, num + 1):
    que.append(i)

for i in range(num):
    que.rotate(-sequence +1)
    result.append(str(que.popleft()))

print('<', ', '.join(result), '>', sep='')