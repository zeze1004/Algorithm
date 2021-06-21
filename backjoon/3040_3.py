import sys

input = sys.stdin.readline

small_man = [int(input()) for _ in range(9)]

all_sum = sum(small_man)

for i in small_man:
    for j in small_man:
        if i == j:
            continue
        elif all_sum - (i + j) == 100:
            small_man.remove(i)
            small_man.remove(j)
            break

for i in small_man:
    print(i)