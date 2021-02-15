N, M = map(int, input().split())
# 카드 숫자 연속으로 받기
card_num = list(map(int, input().split()))
output = 0
for i in range(N):
    for j in range(i+1, N):
        for k in range(j+1, N):
            if card_num[i]+card_num[j]+card_num[k] > M:
                continue
            else:
                output = max(output, card_num[i]+card_num[j]+card_num[k])

print(output)
