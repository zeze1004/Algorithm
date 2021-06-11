import sys

input = sys.stdin.readline

coin_num, goal = map(int, input().split())
coin_list = [int(input()) for _ in range(coin_num)]

min_coin_list = [0] * (goal + 1)

# 점화식
# dp[i] = min(dp[i - coins]) + 1
for i in range(1, goal + 1):
    tmp = []
    for coin in coin_list:
        if min_coin_list[i] != -1 and coin <= i:
            tmp.append(min_coin_list[i - coin])
    if not tmp:
        tmp.append(-1)
    else:
        min_coin_list[i] = min(tmp) + 1

print(min_coin_list)

