import sys
from collections import deque

input = sys.stdin.readline

subin_now, goal = map(int, input().split())
time = [0] * 100001
que = deque()
que.append(subin_now)

def bfs():
    while que:
        now = que.popleft()
        if now == goal:
            return
        for next in (now - 1, now + 1, now * 2):
            if (0 <= next <= 100000) and time[next] == 0:
                time[next] = time[now] + 1
                que.append(next)
bfs()
print(time[goal])