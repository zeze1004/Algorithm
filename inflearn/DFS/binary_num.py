def DFS(num):
    if num == 0:
        return
    else:
        DFS(num // 2)
        print(num % 2, end='')


num = int(input())
DFS(num)
