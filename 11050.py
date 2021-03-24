n, k = map(int, input().split())
if k == 0:
    print(1)
elif k == n:
    a = 1
else:
    a = n - k

for i in range(1, n):
    n *= i

for i in range(1, k):
    k *= i

for i in range(1, a):
    a *= i

print(n // (a * k))
