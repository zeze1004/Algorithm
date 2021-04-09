N, K = map(int, input().split())
arr = list(map(int, input().split()))
card_sum = set()  # set()은 중복을 제거하는 함수
# 3장의 카드를 중복 없이 뽑아야 한다
for i in range(N):
    for j in range(i+1, N):
        for k in range(j+1, N):
            # list.append(), set.add()
            card_sum.add(arr[i]+arr[j]+arr[k])

card_sum = list(card_sum)		 # set은 sort()가 없어서 list로 바꿔줘야 함
card_sum.sort(reverse=True)  # 내림차순

print(card_sum[K-1])
