num = int(input())
k = int(input())
arr = []
# 완전탐색 - 메모리 초과
# for i in range(1, num + 1):
#     for j in range(1, num + 1):
#         arr.append(i*j)

# A보다 작은 숫자가 몇 개인지 찾으면 A가 몇 번째 숫자인지 알 수 있음
# 배열을 찾는다는 생각보다 작은 숫자의 개수를 찾는다 생각하기

left, right = 1, k

while left + 1 < right:
    mid = (left + right) // 2

    tmp = 0
    for i in range(1, num+1):
        # 각 행에서 mid보다 작은 수는 mid//i와 같음
        tmp += min(mid//i, num)  # num을 초과할 수 없음

    if tmp < k:
        left = mid
    else:
        right = mid

print(right)
