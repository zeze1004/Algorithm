num = int(input())
arr = list()

# 입력
for i in range(num):
    arr.append(int(input()))

# 정렬
arr.sort()

# 출력
for i in range(num):
    print(arr[i])
