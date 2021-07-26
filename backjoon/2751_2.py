num = int(input())

input_list = [int(input()) for _ in range(num)]
input_list.sort()
for i in input_list:
    print(i)