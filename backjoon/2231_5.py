num = int(input())

def divide(nums):
    tmp = nums
    tmp_list = [nums]
    while nums > 10:
        tmp_list.append(nums % 10)
        nums = nums // 10

    if sum(tmp_list) + nums == num:
        print(tmp)
        exit(0)


for i in range(1, num):
    divide(i)
print(0)
