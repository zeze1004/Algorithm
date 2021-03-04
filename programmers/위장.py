# https://www.acmicpc.net/problem/9375 똑같은 문제

from collections import Counter


def solution(clothes):
    # Counter를 이용해 중복되는 옷의 종류의 개수를 dictionary로 저장
    cloth = Counter([cloth for kind, cloth in clothes])
    print(cloth)

    result = 1

    # 옷의 종류끼리 모두 곱하면 입을 수 있는 모든 조합이 나옴
    # 그러나 모든 종류를 입어야하는 것은 아니므로 안 입을 수 있는 경우 1 추가로 더함
    for i in cloth:
        result *= (cloth[i] + 1)
    # 스파이는 최소 한 개의 의상은 입으므로 아무것도 안 입는 경우의 수 1 빼줌
    return result - 1
