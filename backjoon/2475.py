arr = list(map(int, input().split()))

count = 0
for i in range(len(arr)):
    count += (arr[i] * arr[i])


print(count % 10)
