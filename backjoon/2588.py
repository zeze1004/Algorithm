arr = []
for i in range(2):
    a = int(input())
    arr.append(a)

hund = arr[1] // 100
ten = (arr[1] - (hund * 100)) // 10
one = (arr[1] - (hund * 100) - (ten * 10))

print(arr[0] * one)
print(arr[0] * ten)
print(arr[0] * hund)
print(arr[0] * arr[1])
