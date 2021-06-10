import sys
input = sys.stdin.readline

case_num = int(input())
list_map = [list(map(int, input().split())) for _ in range(case_num)]
people_num = [0, 0]
for i in range(len(list_map)):
    people_num.append(list_map[i][2])

# 회의 k는 k - 1, k + 1와 회의 시간이 겹치므로
# 회의가 두 개 밖에 없을 시 사람이 제일 많은 회의실 배정
if case_num <= 2:
    print(max(people_num))
    exit(0)

# 점화식: k[i] = max(k[i - 2] + k[i - 3]) + k[i]
for i in range(3, case_num + 2):
    people_num[i] = max(people_num[i - 2], people_num[i - 3]) + people_num[i]

print(max(people_num))