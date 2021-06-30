import sys
input = sys.stdin.readline

case_num = int(input())

arr = [0] * 10001

for i in range(case_num):
    arr[int(input())] += 1

for i in range(10001):
    for j in range(arr[i]):
        print(i)