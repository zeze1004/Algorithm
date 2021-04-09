# 1~N의 합의 공식: N(1+N)/2

num = int(input())

left, right = 1, num

while left + 1 < right:
    mid = (left + right) // 2
    result = (mid * (mid+1)) // 2
    if result <= num:
        left = mid
    else:
        right = mid

print(left)
