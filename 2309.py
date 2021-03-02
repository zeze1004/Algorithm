small = []
small_copy = []
# 입력받기
for i in range(9):
    small.append(int(input()))

# 리스트 복사
small_copy = small[:]

# 전체 키 합하기
sum_small = sum(small)

# 합한 전체 키에서 두 명의 키를 빼서 100을 만든다
for i in range(9):
    for j in range(i+1, 9):
        # print(small[j])
        if sum_small - (small[i] + small[j]) == 100:
            # remove를 바로 쓰면 리스트 내 원소가 줄어서 반복문 index 범위 벗어났다고 오류 뜸
            # small.remove(small[i])
            # small.remove(small[j])
            remove_1 = small[i]
            remove_2 = small[j]

small.remove(remove_1)
small.remove(remove_2)
small.sort()

for i in small:
    print(i)
