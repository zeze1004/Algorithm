A, B, C = map(int, input().split())
height = 0

for day in range(1, 100000001):
    if ((A - B) * day) >= C:
        if ((A - B) * day) - B < C:
            print(day - 1)
            break
        print(day)
        break

    
