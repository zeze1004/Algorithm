go, back, goal = map(int, input().split())

count = goal + back
if count % go == 0:
    print(count // go)
else:
    print(count // go + 1)
    