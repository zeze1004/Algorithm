def divide(num):
    tmp = num
    tmp_list = []
    while num > 10:
        tmp_list.append(num % 10)
        num = num // 10
    tmp_list.append(num)


num = input()

# list_input = []

# for i in range(len(num)):
#     list_input.append(int(num[i]))
# print(sum(list_input))
