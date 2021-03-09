# k가 최대 10억이므로 문자열로 만든 후 k번째 수 찾기 너무 오래 걸림

N = input()

print(N)
print(type(N))
# def make_ten(mid):
#     count = 0
#     while mid >= 10:
#         mid = mid // 10
#         count += 1
#     return count + 1


# left, right = 1, K
# while left + 1 < right:
#     mid = (left + right) // 2

#     if mid >= 10:
#         ten_num = make_ten(mid)
