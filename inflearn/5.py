N, M = map(int, input().split())
min_ = min(N, M)
max_ = max(N, M)
arr = [0]*(N*M) + 1  # 넉넉하게 리스트 만들어주자
for i in range(1, max_ + 1):
    for j in range(1, min_ + 1):
        num = i + j
        arr.append(num)

print(arr)
