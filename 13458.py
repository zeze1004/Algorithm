place_num = int(input())

candidate = list(map(int, input().split()))

king_supervisor, supervisor = map(int, input().split())

for i in candidate:
    i -= king_supervisor
    if i > 0:
        if (i % supervisor) > 0:
            place_num += (i // supervisor) + 1
        else:
            place_num += (i // supervisor)
print(place_num)
