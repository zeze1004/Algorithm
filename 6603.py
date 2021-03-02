from itertools import combinations

while True:
    # 첫 번째로 들어오는 원소는 k에 저장, *s에 나머지 원소 저장
    k, *s = list(map(int, input().split()))  # *value 는 몇 개의 인자를 받을 지 모를 때 사용
    if k == 0:
        break
    combi = list(combinations(s, 6))
    for i in combi:
        for j in list(i):
            print(j, end=' ')
        print()
    print()
