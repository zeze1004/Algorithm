num = int(input())

for j in range(1, num + 1):
    for i in range(num - j, 0, -1):
        print(' ', end = '')
    for k in range(j):
        print('*', end = '')
    print()
    