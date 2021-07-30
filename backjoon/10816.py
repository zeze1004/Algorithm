import sys
input = sys.stdin.readline

num1 = int(input())
card1 = list(map(int, input().split()))

dict1 = {}
for i in range(min(card1), max(card1) + 1):
    dict1[i] = 0

num2 = int(input())
card2 = list(map(int, input().split()))

for i in card1:
    dict1[i] += 1

for i in card2:
    print(dict1[i], end = ' ')
