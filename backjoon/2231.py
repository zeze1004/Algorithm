N = int(input())
output = 0
for i in range(1, N+1):
    num = list(map(int, str(i)))
    sum_num = i + sum(num)
    if (sum_num == N):
        output = i
        break

print(output)
