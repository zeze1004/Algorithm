year = int(input())

if year % 400 == 0:
    print(1)
    exit(0)
elif year % 4 == 0 and not year % 100 == 0:
    print(1)
else:
    print(0)
