num = int(input())

arr = []

for i in range(num):
    arr.append(list(map(int, input().split())))

arr.sort()

for i in range(num):
    print(arr[i][0], arr[i][1], end=' ')
    print()
