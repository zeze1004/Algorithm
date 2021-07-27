num = int(input())

input_list = [int(input()) for _ in range(num)]

arr = [0 for _ in range(1, 10001)]

for i in input_list:
    arr[i] += 1

for i in range(len(arr)):
    for j in range(arr[i]):
        print(i)
