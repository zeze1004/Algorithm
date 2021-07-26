num = int(input())

div_list = [-1] * 5001

for i in range(3, num + 1):
    if i % 5 == 0:
        div_list[i] = i // 5
    elif (i - 3) % 3 == 0:
        div_list[i] = ((i - 3) // 3) + 1
    elif (i - 3) % 5 == 0:
        div_list[i] = ((i - 3) // 5) + 1
if num <= 10:
    print(div_list[num])
    exit(0)

for i in range(11, num + 1):
    if i % 5 == 0:
        div_list[i] = i // 5
    else:
        div_list[i] = (1 + div_list[i - 3])


print(div_list[num])





