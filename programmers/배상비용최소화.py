def solution(no, works):
    while no > 0:
        works.sort()

        if works[-1] == 0:
            return 0
        # 제일 많은 작업량을 1씩 줄임
        works[-1] -= 1
        no -= 1

    return sum([i ** 2 for i in works])
