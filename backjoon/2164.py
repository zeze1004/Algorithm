from collections import deque

num = int(input())

que = deque()

for i in range(1, num + 1):
    que.append(i)

while len(que) != 1:
    que.popleft()
    back = que.popleft()
    que.append(back)
print(que.popleft())