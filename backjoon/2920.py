num = list(map(int, input().split()))

compare_list = [1, 2, 3, 4, 5, 6, 7, 8]


if num == compare_list:
    print('ascending')
    exit(0)

compare_list.reverse()

if num == compare_list:
    print('descending')
else:
    print('mixed')