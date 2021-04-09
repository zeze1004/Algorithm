# import numpy as np
N = (int, input())
arr = list(map(int, input().split()))
index = []
# round(): round half even 방식, 4.5 같이 정확히 0.5값일 때 짝수로 바뀐다
# round(4.5) = 4, round(5.5) = 6
arr_mean = sum(arr)/N
arr_mean = arr_mean + 0.5
# 0.5를 더하고 int로 형변환하면 소수점 아래 버릴 수
arr_mean = int(arr_mean)

min = 100
for i in range(N):
    # 절댓값이 더 작을수록 평균에 가까움
    if abs(arr[i] - arr_mean) <= min:
        min = abs(arr[i] - arr_mean)
        # 번호를 입력
        index.append(i)
print(min, index.pop, sep=' ')
