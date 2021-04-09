def sumArr(i, j, x, y):
    result = 0
    for row in range(i, x + 1):
        result += sum(arr[row][j:y+1])
        print(arr[row][j:y+1])
    print(result)


n, m = map(int, input().split())
arr = []
for i in range(n):
    arr.append(list(map(int, input().split())))

k = int(input())
for num in range(k):
    i, j, x, y = map(int, input().split())
    sumArr(i-1, j-1, x-1, y-1)
