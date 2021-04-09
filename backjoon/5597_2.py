arr = []
for i in range(28):
    a = int(input())
    arr.append(a)

for i in range(1, 31):
    try:
        arr.index(i)
    except:
        print(i)
