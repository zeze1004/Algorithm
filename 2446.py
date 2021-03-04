star = int(input())


for i in range(star):
    print(" " * i + '*' * ((2 * star - 1) - 2 * i) + " " * i)
for i in range(star - 2, -1, -1):
    print(" " * i + '*' * ((2 * star - 1) - 2 * i) + " " * i)
