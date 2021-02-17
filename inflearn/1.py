n, k = map(int, input().split())
output = []

for i in range(1, n+1):
    if n % i == 0:
        output.append(i)

if len(output) < k:
    print(-1)
else:
    print(output[k-1])
