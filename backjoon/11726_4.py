import sys

input = sys.stdin.readline

tile = [1, 2]

num = int(input())

for i in range(2, num):
    tile.append(tile[i - 1] + tile[i - 2])

print(tile[num - 1] % 10007)