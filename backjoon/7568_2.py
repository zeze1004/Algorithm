num = int(input())

input_list = []
for _ in range(num):
    w, h = map(int, input().split())
    input_list.append([w, h])

for i in range(num):
    output = num
    for j in range(num):
        if i == j:
            continue
        else:
            if input_list[i][0] >= input_list[j][0] or input_list[i][1] >= input_list[j][1]:
                output -= 1
    print(output, end = ' ')

