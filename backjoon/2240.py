import sys

input = sys.stdin.readline

second, move_num = map(int, input().split())

tree = [0]
for i in range(1, second + 1):
    tree.append(int(input()))

dp = [[0] * (move_num + 1) for _ in range(second + 1)]

for i in range(1, second + 1):
    # 한 번도 움직이지 않았을 때(dp[i][0]을 채우는 과정)
    if tree[i] == 1:    # 자두가 1번에서 떨어질 때만 받아먹을 수 있음
        dp[i][0] = dp[i - 1][0] + 1
    else:
        dp[i][0] = dp[i - 1][0]  
    
    # 이동 횟수를 1번부터 move_num까지 움직이면서 체크
    for j in range(1, move_num + 1):
        if j > i:
            break

        # 자두가 1번에서 떨어지고                받아먹기
        if tree[i] == 1 and j % 2 == 0: # 1번 나무 부터 시작하니깐 짝수번 이동하면 1번 나무로 컴백
            # dp[i - 1][j]: 지금 이동해서 먹기
            # dp[i - 1][j - 1]: 전에 이동하고 가만히 있다가 먹기
            # 이동 횟수는 동일
            dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - 1]) + 1

        # 자두가 2번에서 떨어지고 그것을 받아먹기
        elif tree[i] == 2 and j % 2 == 1:
            dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - 1]) + 1
        
        # 안 먹는 경우(가만히 있거나 피해서 안 먹는 경우)
        else:
            dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - 1])
print(dp[-1])


