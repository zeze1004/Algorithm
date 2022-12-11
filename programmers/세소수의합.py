from itertools import combinations


def solution(n):
    ans = 0
    prime_array = [True] * n
    minimum = int(n ** 0.5)  # n의 제곱근 수까지만 배수를 구하면 시간절약 가능한

    for i in range(2, minimum + 1):
        if prime_array[i] == True:
            for j in range(i + i, n, i):
                prime_array[j] = False

    prime_num = [i for i in range(2, n) if prime_array[i] == True]  # 2 ~ n 중에서 소수 리스트
    comb = combinations(prime_num, 3)  # 중복 없이 랜덤 3가지 조합
    for i in comb:
        if sum(i) == n:
            ans += 1

    return ans
