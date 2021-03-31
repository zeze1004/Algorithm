num = int(input())
arr = []

for i in range(num):
    arr.append(int(input()))

arr.sort()

for i in range(len(arr)-1, -1, -1):
    print(arr[i])
