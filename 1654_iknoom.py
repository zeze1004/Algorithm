num, goal = map(int, input().split())
arr = []


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
right = 10**18  # max(arr)도 가능
left = 1        # 0은 절대 될 수 없는 수이므로 넣으면 x

# left가 right보다 크면 탐색 끝났으므로 종료
while left + 1 < right:
    # mid는 랜선 길이
    mid = (left + right) // 2

    if max_len(mid) >= goal:
        left = mid
        print('left ', left)
    else:
        right = mid
        print('right ', right)

print(left)
