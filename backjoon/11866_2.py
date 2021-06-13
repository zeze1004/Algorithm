import sys
from collections import deque

input = sys.stdin.readline

num, k = map(int, input().split())

que = deque()
for i in range(1, num + 1):
    que.append(i)

result = []

while que:
    # rotate()
    # 인자가 음수일 경우 왼쪽으로 회전하며 양수가 주어지면 오른쪽으로 회전
    que.rotate(-k + 1)
    result.append(str(que.popleft()))
print('<', ', '.join(result), '>', sep = '')