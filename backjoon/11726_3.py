import sys

input = sys.stdin.readline

num = int(input())

tile = [1, 2]

for i in range(2, num):
    tile.append(tile[i - 2] + tile[i - 1])

print(tile[num - 1] % 10007)