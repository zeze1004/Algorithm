star = int(input())


def stars(n):
    for i in range(n):
        print(" " * i + '*' * ((2 * n - 1) - 2 * i) + " " * i)
    for i in range(n - 2, -1, -1):
        print(" " * i + '*' * ((2 * n - 1) - 2 * i) + " " * i)


stars(star)
