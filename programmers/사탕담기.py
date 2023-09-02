from itertools import combinations


def solution(m, weights):
    cnt = 0
    for i in range(len(weights)):
        comb = combinations(weights, i)
        for j in comb:
            if sum(j) == m:
                cnt += 1

    return cnt
