from collections import deque


def solution(prices):
    answer = []
    prices_que = deque(prices)
    while prices_que:
        price = prices_que.popleft()
        second = 0
        for i in prices_que:
            second += 1
            # 리스트 요소들보다 클 시 반복문 탈출
            if price > i:
                break

        answer.append(second)

    return answer


prices = list(map(int, input().split()))
print(solution(prices))
