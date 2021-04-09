arr = []
people = int(input())
for _ in range(people):
    a = list(map(str, input().split()))
    arr.append(a)

print(arr)

t_count = 0
s_count = 0

for i in range(people):
    # print(arr[i][0])
    if arr[i][0] == 'T':
        t_count += 1
    else:
        s_count += 1
