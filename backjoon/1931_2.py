import sys

input = sys.stdin.readline

num = int(input())
meeting_room = [list(map(int, input().split())) for _ in range(num)]

# 회의 시작 시간을 기준으로 정렬
meeting_room.sort()
# 회의 끝 시간을 기준으로 정렬
meeting_room.sort(key = lambda x:x[1])

count = 0
start = 0

for time in meeting_room:
    if time[0] >= start:
        start = time[1]
        count += 1

print(count)