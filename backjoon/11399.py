num = int(input())

time = list(map(int, input().split()))
time.sort()

present = 0
prevent_sum = 0

for i in range(num):
    present += time[i] + prevent_sum
    prevent_sum += time[i]

print(present)
