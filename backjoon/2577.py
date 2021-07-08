from collections import Counter
A = int(input())
B = int(input())
C = int(input())

result = str(A * B * C)
input_list = []
for i in range(len(result)):
    input_list.append(int(result[i]))
counter = Counter(input_list)

output_list = [0] * 10


for key in counter.keys():

    output_list[key] = counter[key]

for i in output_list:
    print(i)

