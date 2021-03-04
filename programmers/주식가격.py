def solution(prices):
    answer = []

    while prices:
        price = prices.pop(0)
        second = 0
        for i in prices:
            second += 1
            # 리스트 요소들보다 클 시 반복문 탈출
            if price > i:
                break

        answer.append(second)

    return answer


prices = list(map(int, input().split()))
print(solution(prices))
