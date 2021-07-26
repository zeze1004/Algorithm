num = int(input())
input_list = []
for i in range(num):
    input_list.append(list(map(int, input().split())))
    
for i in range(num):
    output = num
    for j in range(num):
        if i == j: 
            continue
        elif input_list[i][0] >= input_list[j][0] or input_list[i][1] >= input_list[j][1]: output -= 1  

    print(output, end = " ")