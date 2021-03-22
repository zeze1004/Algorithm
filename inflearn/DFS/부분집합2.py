num = int(input())
check = [0] * (num + 1)


def DFS(value):
    if value == num + 1:
        for i in range(1, len(check)):
            if check[i] == 1:
                print(i, end=" ")
        print("")
    else:
        check[value] = 1
        DFS(value + 1)
        check[value] = 0
        DFS(value + 1)


DFS(1)
