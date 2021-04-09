num, money = map(int, input().split())

coin = []
output = 0

for i in range(num):
    coin.append(int(input()))

coin.sort(reverse=True)

for i in coin:
    if money == 0:
        break
    output += money // i
    money = money % i

print(output)
