while True:
    nums = list(map(int, input().split()))
    nums.sort()
    if max(nums) == 0:
        exit(0)
    if nums[2] * nums[2] == (nums[0] * nums[0]) + (nums[1] * nums[1]):
        print('right')
    else:
        print('wrong')