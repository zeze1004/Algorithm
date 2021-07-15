case_num = int(input())

for _ in range(case_num):
    H, W, N = map(int, input().split())
    floor = (N % H) * 100
    if floor == 0:
        room_num = H * 100 + (N // H)
    else:
        room_num = floor + ((N // H) + 1)
    print(room_num)