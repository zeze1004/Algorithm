import sys

input = sys.stdin.readline

card_num, goal_num = map(int, input().split())

card = list(map(int, input().split()))
# print(card)

tmp = 0
for i in card:
    for j in card:
        if i == j:
            continue
        for k in card:
            if j == k or i == k:
                continue
            elif i + j + k <= goal_num:
                tmp = max(tmp, i + j +k)
print(tmp)