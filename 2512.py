num = int(input())

budget = list(map(int, input().split()))

max_budget = int(input())

left, right = 0, max(budget)

while left + 1 < right:
    sum_budget = 0
    mid = (left + right) // 2
    # 작은 것 부터 더해서 최댓값 구한다
    for i in budget:
        sum_budget += min(i, mid)

    if sum_budget <= max_budget:
        left = mid
    else:
        right = mid

total_budget = 0
for i in budget:
    if i < right:
        total_budget += i
    else:
        total_budget += right

if total_budget > max_budget:
    print(right-1)
else:
    print(right)
