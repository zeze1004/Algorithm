n, m = int(input().split())
check = [0] * (num + 1)  # 넉넉하게


def DFS(value):
    if value == num + 1:
        for i in range(1, num + 1):
            if check[i] == 1:
                print(i, end=" ")
        print()
    else:
        check[value] = 1  # 사용한다
        DFS(value + 1)
        check[value] = 0
        DFS(value + 1)


DFS(1)