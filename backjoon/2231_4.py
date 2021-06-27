import sys

input = sys.stdin.readline

num = int(input())

def divide(n):
    tmp = n
    result = []
    while n > 10:
        result.append(n % 10)
        n = n // 10
        
    if tmp + sum(result) + n == num:
        print(tmp)
        exit(0)

for i in range(1, num):
    divide(i)
print(0)
    