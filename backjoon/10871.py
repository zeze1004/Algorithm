num, goal = map(int, input().split())
input_list = list(map(int, input().split()))
print(input_list)
output_list = []
for i in input_list:
    if i < goal:
        output_list.append(i)

for i in output_list:
    print(i, end = ' ')
