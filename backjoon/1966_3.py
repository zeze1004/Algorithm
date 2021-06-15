import sys
from collections import deque

input = sys.stdin.readline
test_num = int(input())
for _ in range(test_num):
    num, goal = map(int, input().split())
    que = deque(map(int, input().split()))
    count = 0
    while que:
        top = max(que)
        goal -= 1
        pop = que.popleft()
        if top != pop:
            que.append(pop)
            if goal < 0:
                goal = len(que) - 1
        else:
            count += 1
            if goal == -1:
                print(count)
                break