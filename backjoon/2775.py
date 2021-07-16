case_num = int(input())

for _ in range(case_num):
    floor = int(input())
    room_num = int(input())

    apart = [[0] * room_num for _ in range(floor + 1)]

    for i in range(room_num):
        apart[0][i] = i + 1

    for i in range(floor):
        for j in range(room_num):
            for k in range(j + 1):
                apart[i + 1][j] += apart[i][k]
    print(apart[floor][room_num - 1])
        

