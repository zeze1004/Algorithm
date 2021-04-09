input_str = list(input())
reverse_str = input_str[::-1]

str_len = len(input_str)

if input_str == reverse_str:
    print(str_len)
    exit(0)

i = 0
while input_str != reverse_str:
    if input_str[i] != reverse_str[i]:
        input_str.append(input_str[i+1])
        reverse_str.insert(0, input_str[i+1])
        i = 0
    i += 1

print(input_str)

# while len(input_str) > 1:
#     if input_str.pop(0) != input_str.pop():
#         reverse_str.append(input_str[0])
#         print(reverse_str)

# print(str_len)
