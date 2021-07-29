num = int(input())
input_list = list(map(int, input().split()))

arr = [True] * 1001
arr[1] = False
for i in range(2, 1001):
    if arr[i] == True:
        for j in range(i + i, 1001, i): # i의 배수는 전부 false처리
            arr[j] = False
count = 0
for i in input_list:
    if arr[i] == True:
        count += 1
print(count)