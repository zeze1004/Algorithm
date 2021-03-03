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

# https://velog.io/@devjuun_s/%EC%88%A8%EB%B0%94%EA%BC%AD%EC%A7%88-%EB%B0%B1%EC%A4%80-1697%EB%B2%88python
# from collections import deque

# def bfs(v):
#     count = 0
#     q = deque([[v, count]])
#     while q:
#         v = q.popleft()
#         e = v[0]
#         count = v[1]
#         if not visited[e]:
#             visited[e] = True
#             if e == K:
#                 return count
#             count += 1
#             if (e * 2) <= 100000:
#                 q.append([e * 2, count])
#             if (e + 1) <= 100000:
#                 q.append([e + 1, count])
#             if (e - 1) >= 0:
#                 q.append([e - 1, count])
#     return count

# N, K = map(int, input().split())
# visited = [False] * 100001
# print(bfs(N))
