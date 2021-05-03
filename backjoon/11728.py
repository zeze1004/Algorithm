arr = []

size_a, size_b = map(int, input().split())

# 1차원 배열로 넣기
for _ in range(2):
    arr = arr + (list(map(int, input().split())))

print(' '.join(map(str,sorted(arr))))
