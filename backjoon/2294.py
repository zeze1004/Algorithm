import sys

input = sys.stdin.readline

coin_num, goal_num = map(int, input().split())
coins = [int(input()) for _ in range(coin_num)]

# 15까지 동전들로 만들 수 있는 최소 동전 개수 저장 리스트
min_coin = [0 for _ in range(goal_num + 1)]

for i in range(1, goal_num + 1):
    # i를 동전 몇 개로 만들 수 있는지 경우의 수를 모두 저장하는 리스트
    comparision = []
    for coin in coins:
        if coin <= i and min_coin[i - coin] != -1:
            comparision.append(min_coin[i - coin])
    # 경우의 수 리스트에 아무 값도 들어가지 않으면 i는 코인들의 조합으로 만들 수 없는 값
    if not comparision:
        min_coin[i] = -1
    else:
        # 점화식: dp[i] = min(dp[i - coins]) + 1
        min_coin[i] = min(comparision) + 1

print(min_coin[goal_num])
