arr = []
for _ in range(0, 9):
    a = int(input())
    arr.append(a)

maxnum = max(arr)
print(maxnum)
print(arr.index(maxnum) + 1)
