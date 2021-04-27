num = int(input())

star = [' *', ' * *', ' *****']

for i in range(3):
    num -= 1
    for j in range(num):
        print(end = ' ')
    print(star[i])
    