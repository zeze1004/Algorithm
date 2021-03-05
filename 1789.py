N = int(input())

right = N
left = 1
answer = 0
# 1 ~ n 더하기 공식: n(n+1) / 2
while left <= right:
    mid = (right + left) // 2

    if mid * (mid + 1) // 2 <= N:
        answer = mid
        left = mid + 1

    else:
        right = mid - 1

print(answer)
