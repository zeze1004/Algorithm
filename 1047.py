from collections import deque


def bfs():
    que = deque()
    que.append(subin_place)
    while que:
        subin_now = que.popleft()
        if subin_now == sister_place:
            print(time[subin_now])
            return
        for next in (subin_now - 1, subin_now + 1, subin_now * 2):
            if 0 <= next < 100001 and not time[next]:
                time[next] = time[subin_now] + 1
                que.append(next)


subin_place, sister_place = map(int, input().split())
time = [0] * 100001

bfs()
