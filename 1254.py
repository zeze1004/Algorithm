input_str = list(input())
reverse_str = input_str[::-1]

str_len = len(input_str)

if input_str == reverse_str:
    print(str_len)
    exit(0)

for i in range(str_len):
    if input_str[i] != reverse_str[i]:
        input_str.append(input_str[i])
        reverse_str.insert(0, input_str[i])

print(len(input_str))
