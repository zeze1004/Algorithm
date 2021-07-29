from sys import stdin, stdout

input = stdin.readline

num1 = int(input())
input_list = set(input().split())

num2 = int(input())
compare_list = list(input().split())
# input_list.sort()
# compare_list.sort()
print(compare_list)


for i in compare_list:
    if i in input_list:
        print(1)
    else:
        print(0)

# 이분탐색
# left = 0
# right = num1
# while left < right:
#     for i in compare_list:
#         if i > input_list[]

