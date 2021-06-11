import sys

input = sys.stdin.readline

item_num, limit_w = map(int, input().split())
items = [[0, 0]]
for _ in range(item_num):
    items.append(list(map(int, input().split())))

# 무게 별로 최대 가치 값을 저장하는 리스트
max_value = [[0] * (limit_w + 1) for _ in range(item_num + 1)]

for i in range(1, item_num + 1):
    weight = items[i][0]
    value = items[i][1]
    for w in range(1, limit_w + 1):
        if weight <= w:
            # 해당 무게에서 제일 큰 가치값과,
            # 내 무게와 더해도 limit_w를 넘지 않고 최대의 가치값을 가지고 있는 배열 값 + 내 가치를 더한 값을 
            # 비교함
            max_value[i][w] = max(max_value[i - 1][w], max_value[i - 1][w - weight] + value)
        else:
            # 이전 최대 무게를 넘김
            max_value[i][w] = max_value[i - 1][w]

print(max_value[item_num][limit_w])