num = int(input())

budget = list(map(int, input().split()))

max_budget = int(input())

# 1. 모든 요청이 배정될 수 있는 경우에는 요청한 금액을 그대로 배정한다.
if sum(budget) <= max_budget:
    print(max(budget))

# 2. 그렇지 않으면 특정한 정수 상한액을 계산하여 그 이상인 예산요청에는 모두 상한액을 배정한다.
else:
    # left : success / right : fail
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
    # print max success
    print(left)
