import sys

input = sys.stdin.readline

item_num, max_weight = map(int, input().split())

items = [[0, 0]]
for _ in range(item_num):
    items.append(list(map(int, input().split())))

value_list = [[0] * (max_weight + 1) for _ in range(item_num + 1)]

for i in range(1, item_num + 1):
    w = items[i][0]
    v = items[i][1]
    for j in range(1, max_weight + 1):
        if w <= j:
            value_list[i][j] = max(value_list[i - 1][j], (value_list[i - 1][j - w] + v))
        else:
            value_list[i][j] = value_list[i - 1][j]

print(value_list[item_num][max_weight])