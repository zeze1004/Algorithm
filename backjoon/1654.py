num, goal = map(int, input().split())
arr = []
result = 0


def max_len(mid):
    count = 0
    for i in arr:
        count += (i // mid)  # 각각의 랜선을 mid값으로 나눈 몫이 잘라진 렌선의 개수
    return count


# 입력받기
for i in range(num):
    tmp = int(input())
    arr.append(tmp)

# 1 ~ 가장 큰 랜선
right = max(arr)
left = 1

# left가 right보다 크면 탐색 끝났으므로 종료
while left <= right:
    # mid는 랜선 길이
    mid = (left + right) // 2

    if max_len(mid) >= goal:
        result = mid
        left = mid + 1
    else:
        right = mid - 1

print(result)
