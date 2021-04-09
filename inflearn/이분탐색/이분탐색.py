# 임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수
# 중 한 개의 수인 M이 주어지면 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는
# 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다.

# ▣ 입력예제
# 8 32
# 23 87 65 12 57 32 99 81
# ▣ 출력
# 3

num, goal = map(int, input().split())
arr = list(map(int, input().split()))
arr.sort()
left = 0
right = num - 1

while left <= right:  # 왼쪽이 오른쪽보다 크면 탐색을 다 한 것
    mid = (left + right) // 2
    if arr[mid] == goal:
        print(mid + 1)  # 0번부터 시작하는 index이므로 1 추가해야함
        break
    elif arr[mid] > goal:
        right = mid - 1
    else:
        left = mid + 1
