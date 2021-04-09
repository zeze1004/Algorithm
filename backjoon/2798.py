N, M = map(int, input().split())
# 카드 숫자 연속으로 받기
card_num = list(map(int, input().split()))
output = 0
for i in range(N):
    for j in range(i+1, N):
        for k in range(j+1, N):
            if card_num[i]+card_num[j]+card_num[k] > M:
                continue
                # M이 초과하지 않은 카드의 합은 무조건 ouput값과 비교해서 ouput보다 크면 ouput 값 갱신
            else:
                output = max(output, card_num[i]+card_num[j]+card_num[k])
# 전체 카드 숫자 비교가 끝나면 ouput 값 출력
print(output)
