x, y, w, h = map(int, input().split())

if abs(x - w) > abs(y - h):
    print(abs(y - h))
else:
    print(abs(x - w))