a = int(input())

if a % 5 != 0:
    a = (a // 5) + 1
else:
    a = a // 5

print(a)
