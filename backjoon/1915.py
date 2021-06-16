import sys

input = sys.stdin.readline

y, x = map(int, input().split())
map_list = []
for i in range(y):
    s = input()
    map_list.append(list(map(str, s)))
dp = [[0 for _ in range(x + 1)] for _ in range(y + 1)]

max_num = 0
for i in range(1, y + 1):
    for j in range(1, x + 1):
        if map_list[i - 1][j - 1] == '1':
            dp[i][j] = min(dp[i - 1][j], dp[i][j - 1], dp[i - 1][j - 1]) + 1

            if dp[i][j] > max_num:
                max_num = dp[i][j]

print(max_num*max_num)
