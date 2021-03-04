n = int(input())

tile = [1, 3]
for i in range(2, n+1):
    tile.append(tile[i-2] * 2 + tile[i-1])

print(tile[n-1] % 10007)
