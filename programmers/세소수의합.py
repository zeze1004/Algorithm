import math
from itertools import combinations
def solution(n):
    check = [False, False] + [True]*(n-1)
    for i in range(2, math.ceil(n**0.5)):
        for j in range(i*2, n+1, i):
            check[j] = False
    pn = [i for i in range(2,n) if check[i] == True]
    comb = combinations(pn, 3)
    cnt = 0
    for c in comb:
        if sum(c) == n:
            cnt += 1
    return cnt
