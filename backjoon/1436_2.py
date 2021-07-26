num = int(input())
output_list = []

for i in range(666, 100000001):
    if '666' in str(i):
        output_list.append(i)

print(output_list[num - 1])