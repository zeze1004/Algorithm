arr = list()
num = input()

for i in range(len(num)):
    arr.append(num[i])

arr.sort(reverse=True)  # 내림차순 정렬
print("".join(arr))
