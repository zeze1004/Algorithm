n, k = map(int, input().split())

start = 1  # 시작 수
digits = 1  # 자릿수

# 해당 시작 자리수범위 보다 클 경우 그 개수만큼 차감
while(k > (9*start)*digits):
    tmp = (9*start)*digits
    start *= 10
    digits += 1
    k -= tmp

leave = k % digits  # 나머지
num = k//digits  # start 에서부터의 인덱스
if leave == 0:
    if(n < start+num-1):
        print(-1)
        exit()
    print(int(str(start+num-1)[-1]))
else:
    if(n < start+num):
        print(-1)
        exit()
    print(int(str(start+num)[leave-1]))
