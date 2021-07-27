num = int(input())
input_list = []

for _ in range(num):
    old, name = map(str, input().split())
    input_list.append([int(old), name])
input_list.sort(key=lambda x:x[0])

for i in range(len(input_list)):
    print(input_list[i][0], input_list[i][1])