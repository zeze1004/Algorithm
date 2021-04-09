arr = list(map(int, input().split()))
minut = int(input())

minut += arr[1]

if minut >= 60:
    arr[0] += minut // 60
    minut = minut % 60

if arr[0] >= 24:
    arr[0] -= 24

print(arr[0], minut, end=" ")
