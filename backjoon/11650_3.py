num = int(input())
input_list = [list(map(int, input().split())) for _ in range(num)]
input_list.sort()

for x, y in input_list:
    print(x, y)