import sys

input = sys.stdin.readline

test_num = int(input())
meeting_room = []
for _ in range(test_num):
    x, y = map(int, input().split())
    meeting_room.append([x, y])

meeting_room.sort()
meeting_room.sort(key = lambda x:x[1])
# print(meeting_room)

start, end = meeting_room[0][0], meeting_room[0][1]
# print(start, end)

count = 1

for i in range(1, len(meeting_room)):
    if end <= meeting_room[i][0]:
        end = meeting_room[i][1]
        count += 1
print(count)