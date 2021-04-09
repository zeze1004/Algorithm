star = int(input())
num = star
for k in range(star):
    for i in range(star - k, 0, -1):
        print("*", end="")
    print()
