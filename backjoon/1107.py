button = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
goal_num = int(input()) 	# 이동할려는 채널
wrong_num = int(input())  # 고장난 번호 총 개수

if wrong_num != 0:
    wrong_button = list(map(int, input().split()))

# 고장난 번호 지우기
for j in wrong_button:
    button.remove(j)


print(button)
