import sys

input = sys.stdin.readline

# dp[k] = max(dp[k - 2], dp[k - 3])
people = [0, 0]
num = int(input())
meeting_room = [list(map(int, input().split())) for _ in range(num)]

for i in range(num):
    people.append(meeting_room[i][2])

if num <= 2:
    print(max(people))
    exit(0)

for i in range(3, num + 2):
    people[i] += max(people[i - 3], people[i - 2])
     

print(max(people))
